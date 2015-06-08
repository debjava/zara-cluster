package com.itc.zara.entity;
import java.io.Serializable;

/**
 * The Interface IEntity.
 * 
 * @author Debadatta Mishra (PIKU)
 */
public interface IEntity extends Serializable {
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId();
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id);

}
