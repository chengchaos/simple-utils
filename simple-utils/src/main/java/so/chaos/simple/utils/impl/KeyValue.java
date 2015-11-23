package so.chaos.simple.utils.impl;


import java.io.Serializable;

import so.chaos.simple.utils.NamedData;

/**
 * 
 * @author cheng
 *
 */
public class KeyValue implements NamedData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final Serializable key;
	private final Object value;


	public KeyValue(Serializable key , Object value) {
		this.key = key;
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

	@Override
	public int hashCode() {
		
		return this.getKey().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}
		if (KeyValue.class.isInstance(obj)) {
			KeyValue thatObj = (KeyValue) obj;
			return this.key.equals(thatObj.getKey()) && 
					this.value.equals(thatObj.getValue());
			
		}
		
		return super.equals(obj);
	}

	@Override
	public String toString() {
		
		StringBuilder buff = new StringBuilder(128);
		buff.append("KeyValue : { key : ");
		buff.append(this.key.toString());
		buff.append(", value : ");
		buff.append(value.toString());
		buff.append("}");
		
		return buff.toString();
	}
	
	
	
	
	

}
