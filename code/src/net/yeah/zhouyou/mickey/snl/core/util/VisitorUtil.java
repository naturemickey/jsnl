package net.yeah.zhouyou.mickey.snl.core.util;

import net.yeah.zhouyou.mickey.snl.antlr4.SnlcParser;
import net.yeah.zhouyou.mickey.snl.core.Reference;
import net.yeah.zhouyou.mickey.snl.core.Runtime;
import net.yeah.zhouyou.mickey.snl.core.Visitor;
import net.yeah.zhouyou.mickey.snl.core.type.IType;
import net.yeah.zhouyou.mickey.snl.core.type.StructureType;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisitorUtil {


    public static void findLastStm(SnlcParser.StmListContext ctx) {
        SnlcParser.StmListContext stmList = ctx.stmList();
        SnlcParser.StmContext stm = ctx.stm();
        if (stmList == null || stmList.stm().RETURN() != null) {
            if (stm.callStm() != null
                    && stm.callStm().ID().getText().equals(Runtime.currentContext().currentProcName)) {
                Runtime.currentContext().lastRecStmList.add(stm.callStm());
            } else if (stm.conditionalStm() != null) {
                findLastStm(stm.conditionalStm().stmList(0));
                if (stm.conditionalStm().stmList(1) != null)
                    findLastStm(stm.conditionalStm().stmList(1));
            }
        } else {
            findLastStm(stmList);
        }
    }

    public static Reference createRef(IType type) {
        Reference ref = new Reference(type);
        if (StructureType.Array.class == type.getClass()) {
            StructureType.Array arrayType = ref.getType();
            Reference[] refs = new Reference[arrayType.getLength()];
            for (int i = 0; i < refs.length; ++i) {
                refs[i] = new Reference(arrayType.getBasicType());
            }
            ref.setValue(refs);
        } else if (StructureType.Record.class == type.getClass()) {
            StructureType.Record recordType = ref.getType();
            Map<String, IType> recordTypeMap = recordType.getRecordTypeMap();
            Map<String, Reference> recordFieldMap = new HashMap<>();
            for (Map.Entry<String, IType> e : recordTypeMap.entrySet()) {
                recordFieldMap.put(e.getKey(), createRef(e.getValue()));
            }
            ref.setValue(recordFieldMap);
        }
        return ref;
    }

    public static Integer parseIntc(String val) {
        try {
            return Integer.valueOf(val);
        } catch (Exception e) {
            return (int) val.charAt(1);
        }
    }

    public static void dealParam(Visitor visitor, SnlcParser.ProcDeclareContext ctx, int passType) {
        SnlcParser.ParamListContext paramList = ctx.paramList();
        // 参数处理
        List<Tuple2<String, IType>> params;
        if (paramList != null) {
            visitor.visit(paramList);
            params = Runtime.Stack.pop();
        } else {
            params = Collections.emptyList();
        }
        List<Reference> actParamList = Runtime.Stack.pop();

        if (params.size() != actParamList.size())
            throw new RuntimeException("实参与形参个数不匹配");

        for (int i = 0; i < params.size(); ++i) {
            Tuple2<String, IType> tuple = params.get(i);
            Reference valueRef = actParamList.get(i);
            if (tuple._2.getClass() != valueRef.getType().getClass())
                printException(ctx, "实参与形参类型不对应");

            if (passType == 1) {
                // 实参直接为引用传递
                Runtime.currentContext().addRef(tuple._1, valueRef);
            } else {
                // 以下三行为值传递
                Object value = valueRef.getValue();
                Runtime.currentContext().addRef(tuple._1, createRef(tuple._2));
                Runtime.currentContext().setValue(tuple._1, value);
            }

        }
    }

    public static void printException(ParseTree ctx, String msg) {
        SnlcParser parser = ThreadLocalHelper.get();
        System.err.println((msg != null ? msg : "") + "\ncur tree is " + ctx.toStringTree(parser)
                + "\nparent tree is " + ctx.getParent().toStringTree(parser));
        throw new RuntimeException();
    }
}
