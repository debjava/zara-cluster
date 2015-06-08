package com.itc.zara.cluser.service;

import java.util.List;

/**
 * The Interface ICoreService.
 *
 * @param <E> the element type
 * @param <K> the key type
 * 
 * @author Debadatta Mishra (PIKU)
 */
public interface ICoreService<E,K> {

	/**
	 * Save.
	 *
	 * @param e the e
	 */
	public void save(E e);
	
	/**
	 * Save all.
	 *
	 * @param entities the entities
	 */
	public void saveAll(List<E> entities);

	/**
	 * Delete.
	 *
	 * @param e the e
	 */
	public void delete(E e);
	
	/**
	 * Delete all.
	 *
	 * @param entities the entities
	 */
	public void deleteAll(List<E> entities);

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
