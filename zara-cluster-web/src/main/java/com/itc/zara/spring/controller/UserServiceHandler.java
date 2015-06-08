package com.itc.zara.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ddlab.rnd.entity.user.UserDetailsEntity;
import com.ddlab.rnd.entity.user.UserEntity;
import com.itc.zara.service.user.IUserService;

/**
 * The Class UserServiceHandler.
 * 
 * @author Debadatta Mishra (PIKU)
 */
public class UserServiceHandler implements UserDetailsService {

	/** The user service. */
	@Autowired
	@Qualifier("userService")
	IUserService userService;

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		User loggedInUser = null;

		try {
			UserEntity user1 = userService.getUserByUserName(userName);

			// String user = user1.getUserName();
			String pwd = user1.getPassword();
			System.out.println("Current Password :::"+pwd);
			boolean enabled = user1.isEnabled();
			boolean accountNonExpired = user1.isAccountNonExpired();
			boolean credentialsNonExpired = user1.isCredentialsNonExpired();
			boolean accountNonLocked = user1.isAccountNonLocked();

			List<GrantedAuthority> gList = new ArrayList<GrantedAuthority>();

			Set<UserDetailsEntity> userDetailsSet = user1.getZaraUserDetails();
			for (UserDetailsEntity userDetailsEntity : userDetailsSet) {
				GrantedAuthority ga = new SimpleGrantedAuthority(
						userDetailsEntity.getAuthority());
				gList.add(ga);
			}
			loggedInUser = new User(userName, pwd, enabled, accountNonExpired,
					credentialsNonExpired, accountNonLocked, gList);

			System.out.println("Logged in User :::" + user1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// List<GrantedAuthority> gList = new ArrayList<GrantedAuthority>();
		// GrantedAuthority ga1 = new SimpleGrantedAuthority("ROLE_USER");
		// gList.add(ga1);
		// boolean enabled = true;
		// boolean accountNonExpired = true;
		// boolean credentialsNonExpired = true;
		// boolean accountNonLocked = true;
		// String password = "miki";
		// UserDetails user = new User(userName, password, enabled,
		// accountNonExpired, credentialsNonExpired, accountNonLocked, gList);
		return loggedInUser;

	}

}
