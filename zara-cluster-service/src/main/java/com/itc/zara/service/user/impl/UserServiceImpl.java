package com.itc.zara.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.user.UserDetailsEntity;
import com.ddlab.rnd.entity.user.UserEntity;
import com.itc.zara.cluser.service.AbstractBasicService;
import com.itc.zara.dao.user.IUserDAO;
import com.itc.zara.service.user.IUserService;

/**
 * The Class UserServiceImpl.
 * 
 * @author Debadatta Mishra (PIKU)
 */
@Service(value = "userService")
public class UserServiceImpl extends AbstractBasicService<UserEntity, Long, IUserDAO> implements IUserService {

	/** The user dao. */
	@Autowired
    @Qualifier("userDao")
	IUserDAO userDAO;
	
	/* (non-Javadoc)
	 * @see com.itc.zara.cluser.service.AbstractBasicService#getDao()
	 */
	@Override
	public IUserDAO getDao() {
		return userDAO;
	}
	
	/* (non-Javadoc)
	 * @see com.itc.zara.service.user.IUserService#getAllFilteredUsers(java.util.List)
	 */
	@Override
	public List<UserEntity> getAllFilteredUsers(List<Long> ids) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.service.user.IUserService#getUserByUserName(java.lang.String)
	 */
	@Override
	public UserEntity getUserByUserName(String name) {
		return getDao().getUsersByName(name);
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.service.user.IUserService#getUserDetailsByUserName(java.lang.String)
	 */
	@Override
	public UserDetailsEntity getUserDetailsByUserName(String name) {
		return null;
	}

}
