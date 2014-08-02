package net.yeah.zhouyou.mickey.snl.core;

import net.yeah.zhouyou.mickey.snl.core.type.IType;

public class Reference {

	private IType type;
	private Object value;
	
	public Reference(IType type) {
		this.type = type;
	}

	@SuppressWarnings("unchecked")
	public <T extends IType> T getType() {
		return (T) type;
	}

	@SuppressWarnings("unchecked")
	public <T> T getValue() {
		return (T) value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
