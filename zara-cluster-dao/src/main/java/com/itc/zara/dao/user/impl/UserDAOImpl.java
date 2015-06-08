package com.itc.zara.dao.user.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ddlab.rnd.entity.user.UserEntity;
import com.itc.zara.dao.AbstractCoreDAO;
import com.itc.zara.dao.user.IUserDAO;


 
/**
 * The Class UserDAOImpl.
 * 
 * @author Debadatta Mishra (PIKU)
 */
@Repository(value = "userDao")
public class UserDAOImpl extends AbstractCoreDAO<UserEntity,Long> implements IUserDAO {

	/* (non-Javadoc)
	 * @see com.itc.zara.dao.user.IUserDAO#getUsersById(java.lang.Long)
	 */
	@Override
	public UserEntity getUsersById(Long id) {
		System.out.println("ZaraUserDAOImpl : getUsersById");
		return super.getById(id);
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.dao.user.IUserDAO#getUsersByName(java.lang.String)
	 */
	@Override
	@Transactional
	public UserEntity getUsersByName(String name) {
		UserEntity userEntity = null;
		System.out.println("ZaraUserDAOImpl : getUsersByName");
		String hql = "FROM UserEntity user where user.userName = "+"\'"+name+"\'";
		Query query = getSession().createQuery(hql);
		List results = query.list();
		if( results != null && results.size() != 0 )
			userEntity = (UserEntity) results.get(0);
		return userEntity;
		
	}
	
}
