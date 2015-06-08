package com.itc.zara.cluser.service;
import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.itc.zara.dao.ICoreDAO;
import com.itc.zara.entity.IEntity;

/**
 * The Class AbstractBasicService.
 *
 * @param <E> the element type
 * @param <K> the key type
 * @param <D> the generic type
 * 
 * @author Debadatta Mishra (PIKU)
 */
@Transactional
public abstract class AbstractBasicService<E extends IEntity, K extends Serializable, D extends ICoreDAO<E, K>> implements ICoreService<E, K> {

	/**
	 * Gets the dao.
	 *
	 * @return the dao
	 */
	public abstract D getDao();

	/* (non-Javadoc)
	 * @see com.itc.zara.cluser.service.ICoreService#save(java.lang.Object)
	 */
	public void save(E e) {
		System.out.println("getDAO-11111111------------>"+getDao());
		getDao().save(e);
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.cluser.service.ICoreService#saveAll(java.util.List)
	 */
	public void saveAll(List<E> entities) {
		
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.cluser.service.ICoreService#delete(java.lang.Object)
	 */
	public void delete(E e) {
		System.out.println("Coming to delete()....................");
		getDao().delete(e);
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.cluser.service.ICoreService#deleteAll(java.util.List)
	 */
	public void deleteAll(List<E> entities) {
		System.out.println("Coming to deleteAll()....................");
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.cluser.service.ICoreService#getAll()
	 */
	public List<E> getAll() {
		System.out.println("Coming to getAll()....................");
		return getDao().getAll();
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.cluser.service.ICoreService#getById(java.lang.Object)
	 */
	public E getById(K id) {
		System.out.println("Coming to getById()....................");
		return getDao().getById(id);
	}
}
