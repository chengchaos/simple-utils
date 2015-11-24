package so.chaos.simple.utils.impl;

import java.io.Serializable;

import so.chaos.simple.utils.NamedData;

public class MutableKeyValue implements NamedData {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Serializable key;
	private Object value;
	
	
	
	public void setKey(Serializable key) {
		this.key = key;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public Serializable getKey() {
		return this.key;
	}

	@Override
	public Object getValue() {
		return this.value;
	}
	
	public NamedData toImmutable() {
		return KeyValue.newInstance(key, value);
	}

}
