package com.itc.zara.dao;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ddlab.rnd.entity.user.UserDetailsEntity;
import com.ddlab.rnd.entity.user.UserEntity;
import com.itc.zara.dao.user.IUserDAO;

/**
 * The Class UserTest.
 * 
 * @author Debadatta Mishra (PIKU)
 */
public class UserTest {
	
	/** The context. */
	private static ApplicationContext context = null;
	
	/** The user dao. */
	private static IUserDAO userDAO = null;
	
	/**
	 * Inits the.
	 */
	@BeforeClass
	public static void init() {
		new UserTest().doSetup();
	}
	
	/**
	 * Do setup.
	 */
	public void doSetup() {
		context = new ClassPathXmlApplicationContext("test-dao.xml");
		userDAO = (IUserDAO) context.getBean("userDao");
	}
	
	/**
	 * Test create user.
	 */
	@Test
	public void testCreateUser() {
		UserEntity user = createUser();
		userDAO.save(user);
		UserEntity user1 = userDAO.getUsersByName("Deb");
		System.out.println("User password :::"+user1.getPassword());
		
		assertEquals("DebABCD",user1.getPassword());
		
	}
	
	/**
	 * Creates the user.
	 *
	 * @return the user entity
	 */
	private UserEntity createUser() {
		UserEntity user = new UserEntity();
		user.setUserId(1);
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.setEnabled(true);
		user.setPassword("DebABCD");
		user.setUserName("Deb");
		
		UserDetailsEntity userdetailsEntity = new UserDetailsEntity("Deb", "ROLE_ADMIN", user);
		Set<UserDetailsEntity> userDetailsList = new HashSet<UserDetailsEntity>();
		userDetailsList.add(userdetailsEntity);
		user.setZaraUserDetails(userDetailsList);
		
		return user;
	}

}
