/* 
 * http://chaos.so
 */
package so.chaos.simple.utils;


import java.io.Serializable;

/**
 * @author  程超  
 * @version 1.0
 * @created 2014年12月30日 上午11:30:22
 */
public interface NamedData extends Serializable {


	/**    
	 * 返回 key 的值     
	 * @return key    
	 */
	public abstract Serializable getKey();

	/**    
	 * 返回 value 的值     
	 * @return value    
	 */
	public abstract Object getValue();

}