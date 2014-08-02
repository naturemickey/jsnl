package net.yeah.zhouyou.mickey.snl.core.type;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import net.yeah.zhouyou.mickey.snl.core.Reference;

public abstract class StructureType implements IType {

	public static class Array extends StructureType {

		private BasicType type;
		private int low;
		private int top;

		public BasicType getBasicType() {
			return type;
		}

		public int getLength() {
			return top - low + 1;
		}

		public Array(BasicType basicType, int low, int top) {
			this.type = basicType;
			this.low = low;
			this.top = top;
		}

		public Reference get(Reference[] array, int i) {
			if (i > top)
				throw new RuntimeException();
			return array[i - low];
		}
	}

	public static class Record extends StructureType {
		private Map<String, IType> recordTypeMap = new HashMap<>();

		public Record(Map<String, IType> typeMap) {
			this.recordTypeMap = Collections.unmodifiableMap(typeMap);
		}

		public Map<String, IType> getRecordTypeMap() {
			return recordTypeMap;
		}

		public Reference get(Map<String, Reference> refMap, String name) {
			return refMap.get(name);
		}

		public Reference get(Map<String, Reference> refMap, String name, int i) {
			Reference array = refMap.get(name);
			if (array != null && array.getType().getClass() == Array.class) {
				Array at = (Array) array.getType();
				Reference[] ay = array.getValue();
				return at.get(ay, i);
			}
			throw new RuntimeException();
		}
	}
}
