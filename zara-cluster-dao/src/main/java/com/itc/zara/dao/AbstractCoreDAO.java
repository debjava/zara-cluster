package com.itc.zara.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.itc.zara.entity.IEntity;

/**
 * The Class AbstractCoreDAO.
 *
 * @param <E> the element type
 * @param <K> the key type
 * 
 * @author Debadatta Mishra (PIKU)
 */
public abstract class AbstractCoreDAO<E extends IEntity, K extends Serializable>
		implements ICoreDAO<E, K> {

	/** The session factory. */
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	/**
	 * Gets the session.
	 *
	 * @return the session
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.dao.ICoreDAO#save(com.itc.zara.entity.IEntity)
	 */
	@Transactional
	public void save(E e) {
		try {
			getSession().save(e);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.dao.ICoreDAO#delete(com.itc.zara.entity.IEntity)
	 */
	public void delete(E e) {
		System.out.println("Going to delete--->" + e);
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.dao.ICoreDAO#getAll()
	 */
	public List<E> getAll() {
		String hql = "FROM UserEntity";
		return getSession().createQuery(hql).list();
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.dao.ICoreDAO#getById(java.io.Serializable)
	 */
	public E getById(K id) {
		String hql = "FROM UserEntity u where u.id =:id";
		Query query = getSession().createQuery(hql);
		query.setParameter("id", id);
		return (E) query.list().get(0);
	}
}
