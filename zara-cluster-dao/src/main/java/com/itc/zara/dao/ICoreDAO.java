package com.itc.zara.dao;
import java.io.Serializable;
import java.util.List;

import com.itc.zara.entity.IEntity;

 
/**
 * The Interface ICoreDAO.
 *
 * @param <E> the element type
 * @param <K> the key type
 * 
 * @author Debadatta Mishra (PIKU)
 */
public interface ICoreDAO<E extends IEntity , K extends Serializable> {

	/**
	 * Save.
	 *
	 * @param e the e
	 */
	public void save(E e);
	
	/**
	 * Delete.
	 *
	 * @param e the e
	 */
	public void delete(E e);
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<E> getAll();

    /**
     * Gets the by id.
     *
     * @param id the id
     * @return the by id
     */
    public E getById(K id);
	
}
