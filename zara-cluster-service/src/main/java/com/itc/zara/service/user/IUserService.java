package com.itc.zara.service.user;

import java.util.List;

import com.ddlab.rnd.entity.user.UserEntity;
import com.ddlab.rnd.entity.user.UserDetailsEntity;

/**
 * The Interface IUserService.
 * 
 * @author Debadatta Mishra (PIKU)
 */
public interface IUserService {
	
	/**
	 * Gets the all filtered users.
	 *
	 * @param ids the ids
	 * @return the all filtered users
	 */
	public List<UserEntity> getAllFilteredUsers(List<Long> ids);
	
	/**
	 * Gets the user by user name.
	 *
	 * @param name the name
	 * @return the user by user name
	 */
	public UserEntity getUserByUserName(String name);
	
	/**
	 * Gets the user details by user name.
	 *
	 * @param name the name
	 * @return the user details by user name
	 */
	public UserDetailsEntity getUserDetailsByUserName(String name);

}
