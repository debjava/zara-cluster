package com.ddlab.rnd.entity.user;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.itc.zara.entity.IEntity;

/**
 * The Class UserEntity.
 * 
 * @author Debadatta Mishra (PIKU)
 */
@Entity
@Table(name="zara_user")
public class UserEntity implements IEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7534699551344892730L;

	/** The user id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private long userId;
	
	/** The user name. */
	@Column(name="username")
	private String userName;
	
	/** The password. */
	@Column(name="password")
	private String password;
	
	/** The enabled. */
	@Column(name="enabled")
	private boolean enabled;
	
	/** The account non expired. */
	@Column(name="accountNonExpired")
	private boolean accountNonExpired;
	
	/** The credentials non expired. */
	@Column(name="credentialsNonExpired")
	private boolean credentialsNonExpired;
	
	/** The account non locked. */
	@Column(name="accountNonLocked")
	private boolean accountNonLocked;
	
	
	/** The zara user details. */
	@OneToMany(fetch = FetchType.EAGER, cascade={CascadeType.ALL})
    @JoinColumn(name="userid")
    private Set<UserDetailsEntity> zaraUserDetails;

	/**
	 * Instantiates a new user entity.
	 */
	public UserEntity() {
		
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public long getUserId() {
		return userId;
	}


	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}


	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}


	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * Checks if is enabled.
	 *
	 * @return true, if is enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled.
	 *
	 * @param enabled the new enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	/**
	 * Checks if is account non expired.
	 *
	 * @return true, if is account non expired
	 */
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}


	/**
	 * Sets the account non expired.
	 *
	 * @param accountNonExpired the new account non expired
	 */
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}


	/**
	 * Checks if is credentials non expired.
	 *
	 * @return true, if is credentials non expired
	 */
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}


	/**
	 * Sets the credentials non expired.
	 *
	 * @param credentialsNonExpired the new credentials non expired
	 */
	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}


	/**
	 * Checks if is account non locked.
	 *
	 * @return true, if is account non locked
	 */
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}


	/**
	 * Sets the account non locked.
	 *
	 * @param accountNonLocked the new account non locked
	 */
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}


	/**
	 * Gets the zara user details.
	 *
	 * @return the zara user details
	 */
	public Set<UserDetailsEntity> getZaraUserDetails() {
		return zaraUserDetails;
	}


	/**
	 * Sets the zara user details.
	 *
	 * @param zaraUserDetails the new zara user details
	 */
	public void setZaraUserDetails(Set<UserDetailsEntity> zaraUserDetails) {
		this.zaraUserDetails = zaraUserDetails;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ZaraUser [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", enabled=" + enabled
				+ ", accountNonExpired=" + accountNonExpired
				+ ", credentialsNonExpired=" + credentialsNonExpired
				+ ", accountNonLocked=" + accountNonLocked
				+ ", zaraUserDetails=" + zaraUserDetails + "]";
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.entity.IEntity#getId()
	 */
	@Override
	public long getId() {
		return this.userId;
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.entity.IEntity#setId(long)
	 */
	@Override
	public void setId(long id) {
		this.userId = id;
		
	}

}
