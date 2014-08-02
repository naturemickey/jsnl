package net.yeah.zhouyou.mickey.snl.core;

import net.yeah.zhouyou.mickey.snl.antlr4.SnlcBaseVisitor;
import net.yeah.zhouyou.mickey.snl.antlr4.SnlcParser;
import net.yeah.zhouyou.mickey.snl.antlr4.SnlcParser.*;
import net.yeah.zhouyou.mickey.snl.core.type.BasicType;
import net.yeah.zhouyou.mickey.snl.core.type.IType;
import net.yeah.zhouyou.mickey.snl.core.type.StructureType;
import net.yeah.zhouyou.mickey.snl.core.util.LongJump;
import net.yeah.zhouyou.mickey.snl.core.util.Return;
import net.yeah.zhouyou.mickey.snl.core.util.Tuple2;
import org.antlr.v4.runtime.Token;

import java.util.*;
import java.util.stream.Collectors;

import static net.yeah.zhouyou.mickey.snl.core.util.VisitorUtil.*;

public class Visitor extends SnlcBaseVisitor<Object> {

    private final Object _void = new Object();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Object visitDeclarePart(DeclarePartContext ctx) {
        TypeDecpartContext typeDecpart = ctx.typeDecpart();
        VarDecpartContext varDecpart = ctx.varDecpart();
        ProcDecpartContext procDecpart = ctx.procDecpart();

        if (typeDecpart != null)
            visit(typeDecpart);
        if (varDecpart != null)
            visit(varDecpart);
        if (procDecpart != null)
            visit(procDecpart);
        return _void;
    }

    @Override
    public Object visitOutputStm(OutputStmContext ctx) {
        visit(ctx.exp());
        Reference ref = Runtime.Stack.pop();
        Object o = ref.getValue();
        if (ref.getType().getClass() == BasicType.Char.class)
            System.out.println((char) ((Integer) o).intValue());
        else
            System.out.println(o);
        return _void;
    }

    @Override
    public Object visitConditionalStm(ConditionalStmContext ctx) {
        visit(ctx.condExp());
        Boolean cond = Runtime.Stack.pop();
        if (cond)
            visit(ctx.stmList(0));
        else {
            StmListContext stmList = ctx.stmList(1);
            if (stmList != null)
                visit(ctx.stmList(1));
        }
        return _void;
    }

    @Override
    public Object visitProgram(ProgramContext ctx) {
        ProgramHeadContext programHead = ctx.programHead();
        DeclarePartContext declarePart = ctx.declarePart();
        ProgramBodyContext programBody = ctx.programBody();

        visit(programHead);
        visit(declarePart);
        if (programBody != null)
            visit(programBody);
        return _void;
    }

    @Override
    public Object visitIdList(IdListContext ctx) {
        IdListContext idList = ctx.idList();
        if (idList != null) {
            visit(idList);
            List<String> il = Runtime.Stack.pop();
            il.add(ctx.ID().getText());
            Runtime.Stack.push(il);
        } else {
            List<String> il = new ArrayList<>(1);
            il.add(ctx.ID().getText());
            Runtime.Stack.push(il);
        }
        return _void;
    }

    @Override
    public Object visitInputStm(InputStmContext ctx) {
        if (scanner.hasNext()) {
            String line = scanner.nextLine();
            Runtime.currentContext().setValue(ctx.invar.getText(), line);
        }
        return _void;
    }

    @Override
    public Object visitTypeDef(TypeDefContext ctx) {
        BasicTypeContext basicType = ctx.basicType();
        if (basicType != null) {
            visit(basicType);
            return _void;
        }
        StructureTypeContext structureType = ctx.structureType();
        if (structureType != null) {
            visit(structureType);
        } else {
            String id = ctx.ID().getText();
            Runtime.Stack.push(Runtime.currentContext().getType(id));
        }
        return _void;
    }

    @Override
    public Object visitTypeDecList(TypeDecListContext ctx) {
        String typeId = ctx.typeId.getText();
        visit(ctx.typeDef());
        Runtime.currentContext().setType(typeId, Runtime.Stack.pop());

        TypeDecListContext more = ctx.typeDecList();
        if (more != null)
            visit(more);
        return _void;
    }

    @Override
    public Object visitProcDecpart(ProcDecpartContext ctx) {
        // 此时不调用过程，visit(ctx.procDeclare());
        ProcDeclareContext procDeclare = ctx.procDeclare();
        Runtime.currentContext().addProc(procDeclare);

        ProcDecpartContext more = ctx.procDecpart();
        if (more != null)
            visit(more);
        return _void;
    }

    @Override
    public Object visitParam(ParamContext ctx) {
        visit(ctx.typeDef());
        IType type = Runtime.Stack.pop();

        visit(ctx.idList());
        List<String> idList = Runtime.Stack.pop();

        Runtime.Stack.push(idList.stream().map(id -> new Tuple2<>(id, type)).collect(Collectors.toList()));
        return _void;
    }

    @Override
    public Object visitTypeDecpart(TypeDecpartContext ctx) {
        visit(ctx.typeDecList());
        return _void;
    }

    @Override
    public Object visitExp(ExpContext ctx) {
        Token op = ctx.op;
        if (op != null) {
            visit(ctx.exp(1));
            visit(ctx.exp(0));

            Reference left = Runtime.Stack.pop();
            Reference right = Runtime.Stack.pop();
            if (left.getType().getClass() != right.getType().getClass()
                    || !BasicType.class.isAssignableFrom(left.getType().getClass()))
                throw new RuntimeException("非基础类型不能做四则算数操作");

            Reference res = new Reference(new BasicType.Int());

            Integer leftValue = left.getValue();
            Integer rightValue = right.getValue();
            switch (op.getType()) {
                case SnlcParser.ADD:
                    res.setValue(leftValue + rightValue);
                    break;
                case SnlcParser.SUB:
                    res.setValue(leftValue - rightValue);
                    break;
                case SnlcParser.MUL:
                    res.setValue(leftValue * rightValue);
                    break;
                case SnlcParser.DIV:
                    res.setValue(leftValue / rightValue);
                    break;
            }
            Runtime.Stack.push(res);
        } else {
            visit(ctx.factor());
        }
        return _void;
    }

    @Override
    public Object visitFactor(FactorContext ctx) {
        ExpContext exp = ctx.exp();
        if (exp != null) {
            visit(exp);
            return _void;
        }
        Token intVal = ctx.intVal;
        if (intVal != null) {
            Reference ref = new Reference(new BasicType.Int());
            ref.setValue(parseIntc(intVal.getText()));
            Runtime.Stack.push(ref);
            return _void;
        }
        visit(ctx.variable());
        return _void;
    }

    @Override
    public Object visitFieldDecList(FieldDecListContext ctx) {
        FieldDecListContext fieldDecList = ctx.fieldDecList();
        if (fieldDecList != null) {
            visit(fieldDecList);
        } else {
            Runtime.Stack.push(new HashMap<>());
        }

        Map<String, IType> typeMap = Runtime.Stack.pop();

        visit(ctx.typeDef());
        IType type = Runtime.Stack.pop();

        visit(ctx.idList());
        List<String> idList = Runtime.Stack.pop();
        for (String id : idList) {
            IType t = typeMap.put(id, type);
            if (t != null)
                throw new RuntimeException();
        }
        Runtime.Stack.push(typeMap);
        return _void;
    }

    @Override
    public Object visitProcDeclare(ProcDeclareContext ctx) {
        Runtime.currentContext().currentProcName = ctx.procName.getText();

        findLastStm(ctx.programBody().stmList());
        while (true) {
            try {
                dealParam(this, ctx, 1);

                visit(ctx.declarePart());
                visit(ctx.programBody());
                break;
            } catch (LongJump e) {
                // do nothing
            } catch (Return e) {
                break;
            }
        }

        Runtime.setCurrentContext(Runtime.currentContext().getParent());
        Runtime.Stack.clearIdx();
        return _void;
    }

    @Override
    public Object visitCallStm(CallStmContext ctx) {
        String procName = ctx.ID().getText();
        ProcDeclareContext proc = Runtime.currentContext().getProc(procName);
        visit(ctx.actParamList());
        if (procName.equals(Runtime.currentContext().currentProcName)) {
            Runtime.currentContext().lastRecStmList.stream().filter(cc ->
                    cc == ctx).findAny().ifPresent(cc -> {
                Runtime.currentContext().clear();
                throw new LongJump();
            });
        }
        Runtime.setCurrentContext(new Context(Runtime.currentContext()));
        Runtime.Stack.recordIdx();
        visit(proc);
        return _void;
    }

    @Override
    public Object visitArrayType(ArrayTypeContext ctx) {
        visit(ctx.basicType());
        Integer low = parseIntc(ctx.low.getText());
        Integer top = parseIntc(ctx.top.getText());
        Runtime.Stack.push(new StructureType.Array(Runtime.Stack.pop(), low, top));
        return _void;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object visitRecordType(RecordTypeContext ctx) {
        visit(ctx.fieldDecList());
        Runtime.Stack.push(new StructureType.Record(Runtime.Stack.pop()));
        return _void;
    }

    @Override
    public Object visitAssignment(AssignmentContext ctx) {
        visit(ctx.variable());
        Reference ref = Runtime.Stack.pop();
        visit(ctx.exp());
        Reference v = Runtime.Stack.pop();
        ref.setValue(v.getValue());
        return _void;
    }

    @Override
    public Object visitStmList(StmListContext ctx) {
        StmContext stm = ctx.stm();
        visit(stm);

        if (stm.RETURN() == null) {
            StmListContext stmList = ctx.stmList();
            if (stmList != null)
                visit(stmList);
        }
        return _void;
    }

    @Override
    public Object visitStm(StmContext ctx) {
        if (ctx.RETURN() != null) {
            throw new Return();
        }
        InputStmContext inputStm = ctx.inputStm();
        if (inputStm != null) {
            visit(inputStm);
            return _void;
        }
        OutputStmContext outputStm = ctx.outputStm();
        if (outputStm != null) {
            visit(outputStm);
            return _void;
        }
        ConditionalStmContext conditionalStm = ctx.conditionalStm();
        if (conditionalStm != null) {
            visit(conditionalStm);
            return _void;
        }
        LoopStmContext loopStm = ctx.loopStm();
        if (loopStm != null) {
            visit(loopStm);
            return _void;
        }
        AssignmentContext assignment = ctx.assignment();
        if (assignment != null) {
            visit(assignment);
            return _void;
        }
        CallStmContext callStm = ctx.callStm();
        if (callStm != null) {
            visit(callStm);
            return _void;
        }
        return _void;
    }

    @Override
    public Object visitBasicType(BasicTypeContext ctx) {
        if (ctx.INTEGER() != null) {
            Runtime.Stack.push(new BasicType.Int());
        } else {
            Runtime.Stack.push(new BasicType.Char());
        }
        return _void;
    }

    @Override
    public Object visitProgramHead(ProgramHeadContext ctx) {
        // 暂时用不到programName，所在这里先不写
        return _void;
    }

    @Override
    public Object visitLoopStm(LoopStmContext ctx) {
        while (true) {
            visit(ctx.condExp());
            Boolean cond = Runtime.Stack.pop();
            if (!cond)
                break;
            visit(ctx.stmList());
        }
        return _void;
    }

    @Override
    public Object visitActParamList(ActParamListContext ctx) {
        ActParamListContext actParamList = ctx.actParamList();
        if (actParamList != null) {
            visit(actParamList);
        } else {
            Runtime.Stack.push(new ArrayList<>());
        }
        List<Reference> refList = Runtime.Stack.pop();
        visit(ctx.exp());
        Reference ref = Runtime.Stack.pop();
        refList.add(ref);

        Runtime.Stack.push(refList);
        return _void;
    }

    @Override
    public Object visitCondExp(CondExpContext ctx) {
        visit(ctx.exp(0));
        visit(ctx.exp(1));

        Reference right = Runtime.Stack.pop();
        Reference left = Runtime.Stack.pop();

        Integer rightValue = right.getValue();
        Integer leftValue = left.getValue();

        Token cmpOp = ctx.cmpOp;
        if (cmpOp.getType() == SnlcParser.LT) {
            Runtime.Stack.push(leftValue < rightValue);
        } else {
            Runtime.Stack.push(leftValue.equals(rightValue));
        }
        return _void;
    }

    @Override
    public Object visitProgramBody(ProgramBodyContext ctx) {
        visit(ctx.stmList());
        return _void;
    }

    @Override
    public Object visitStructureType(StructureTypeContext ctx) {
        ArrayTypeContext arrayType = ctx.arrayType();
        if (arrayType != null) {
            visit(arrayType);
        } else {
            visit(ctx.recordType());
        }
        return _void;
    }

    @Override
    public Object visitVarDecpart(VarDecpartContext ctx) {
        visit(ctx.varDecList());
        return _void;
    }

    @Override
    public Object visitParamList(ParamListContext ctx) {
        visit(ctx.param());
        ParamListContext paramList = ctx.paramList();
        if (paramList != null) {
            visit(paramList);
            List<Tuple2<String, IType>> pl1 = Runtime.Stack.pop();
            List<Tuple2<String, IType>> pl2 = Runtime.Stack.pop();
            pl1.addAll(pl2);
            Runtime.Stack.push(pl1);
        }
        return _void;
    }

    @Override
    public Object visitVarDecList(VarDecListContext ctx) {
        visit(ctx.typeDef());
        IType type = Runtime.Stack.pop();
        visit(ctx.idList());
        List<String> idList = Runtime.Stack.pop();
        for (String id : idList) {
            Runtime.currentContext().addRef(id, createRef(type));
        }

        VarDecListContext more = ctx.varDecList();
        if (more != null)
            visit(more);
        return _void;
    }

    @Override
    public Object visitVariable(VariableContext ctx) {
        String id = ctx.ID().getText();
        Reference ref = Runtime.currentContext().getVariable(id);
        Runtime.Stack.push(ref);

        VariMoreContext variMore = ctx.variMore();
        if (variMore != null) {
            visit(variMore);
        }
        return _void;
    }

    @Override
    public Object visitVariMore(VariMoreContext ctx) {
        Reference ref = Runtime.Stack.pop();
        if (ctx.DOT() != null) {
            String id = ctx.ID().getText();
            Map<String, Reference> refMap = ref.getValue();
            Reference r = refMap.get(id);
            Runtime.Stack.push(r);

            VariMoreContext variMore = ctx.variMore();
            if (variMore != null)
                visit(variMore);
        } else {
            visit(ctx.exp());
            Reference idxRef = Runtime.Stack.pop();
            StructureType.Array type = ref.getType();
            Reference[] array = ref.getValue();
            Reference r = type.get(array, idxRef.getValue());
            Runtime.Stack.push(r);
        }
        return _void;
    }
}
