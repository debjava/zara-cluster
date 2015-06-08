package com.itc.zara.dao.user;

import com.ddlab.rnd.entity.user.UserEntity;
import com.itc.zara.dao.ICoreDAO;
 
/**
 * The Interface IUserDAO.
 * 
 * @author Debadatta Mishra (PIKU)
 */
public interface IUserDAO extends ICoreDAO<UserEntity,Long> {
	
	/**
	 * Gets the users by id.
	 *
	 * @param id the id
	 * @return the users by id
	 */
	public UserEntity getUsersById(Long id);
	
	/**
	 * Gets the users by name.
	 *
	 * @param name the name
	 * @return the users by name
	 */
	public UserEntity getUsersByName(String name);

}
