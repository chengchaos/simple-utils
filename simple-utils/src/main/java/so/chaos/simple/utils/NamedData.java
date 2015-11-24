/* 
 * http://chaos.so
 */
package so.chaos.simple.utils;


import java.io.Serializable;

/**
 * @author chengchaos@gmail.com
 * @version 1.0
 * @created 2014年12月30日 上午11:30:22
 */
public interface NamedData extends Serializable {

	/**    
	 * @return key    
	 */
	public abstract Serializable getKey();

	/**    
	 * @return value    
	 */
	public abstract Object getValue();

}