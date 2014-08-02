package net.yeah.zhouyou.mickey.snl.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.yeah.zhouyou.mickey.snl.antlr4.SnlcParser;
import net.yeah.zhouyou.mickey.snl.antlr4.SnlcParser.ProcDeclareContext;
import net.yeah.zhouyou.mickey.snl.core.type.BasicType;
import net.yeah.zhouyou.mickey.snl.core.type.IType;

public class Context {

	private Map<String, Reference> refMap = new HashMap<>();
	// 以procName做为过程签名会导致这个语言不支持重载
	private Map<String, ProcDeclareContext> procMap = new HashMap<>();
	private Map<String, IType> typeMap = new HashMap<>();

    public List<SnlcParser.CallStmContext> lastRecStmList = new ArrayList<>();
    public String currentProcName;

	public Context() {
	}

	public Context(Context parent) {
		this.parent = parent;
	}

	private Context parent;

	public Context getParent() {
		return parent;
	}

	public ProcDeclareContext getProc(String name) {
		ProcDeclareContext res = procMap.get(name);
		if (res != null)
			return res;
		return parent.getProc(name);
	}

    public void clear() {
        this.refMap.clear();
        this.typeMap.clear();
        this.procMap.clear();
    }

	public void addProc(ProcDeclareContext proc) {
		String procName = proc.procName.getText();

		ProcDeclareContext p = procMap.put(procName, proc);
		if (p != null)
			throw new RuntimeException();
	}

	public void addRef(String varName, Reference ref) {
		Reference r = refMap.put(varName, ref);
		if (r != null)
			throw new RuntimeException();
	}

	public void setValue(String varName, String value) {
		Reference cr = refMap.get(varName);
		if (cr != null) {
			if (BasicType.class.isAssignableFrom(cr.getType().getClass())) {
				cr.setValue(BasicType.class.cast(cr.getType()).construct(value));
			} else
				throw new RuntimeException();
		} else if (parent != null) {
			parent.setValue(varName, value);
		} else
			throw new RuntimeException();
	}

	public void setValue(String varName, Object value) {
		Reference cr = refMap.get(varName);
		if (cr != null) {
			cr.setValue(value);
		} else if (parent != null) {
			parent.setValue(varName, value);
		} else
			throw new RuntimeException("不存在的引用名：" + varName);
	}

	public void setType(String typeId, IType type) {
		typeMap.put(typeId, type);
	}

	public IType getType(String typeId) {
		IType type = typeMap.get(typeId);
		if (type == null)
			throw new RuntimeException();
		return type;
	}

	public Reference getVariable(String varName) {
		Reference ref = refMap.get(varName);
		if (ref != null)
			return ref;
		if (parent != null)
			return parent.getVariable(varName);
		throw new RuntimeException("不存在的变量：" + varName);
	}
}
