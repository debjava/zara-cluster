package com.ddlab.rnd.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.itc.zara.entity.IEntity;

/**
 * The Class UserDetailsEntity.
 * 
 * @author Debadatta Mishra (PIKU)
 */
@Entity
@Table(name="zara_userdetails")
public class UserDetailsEntity implements IEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7698286130450472294L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	/** The username. */
	@Column(name="username")
	private String username;
	
	/** The authority. */
	@Column(name="authority")
	private String authority;
	
	/** The zara user. */
	@ManyToOne
    @JoinColumn(name="userid")
    private UserEntity zaraUser;
	
	/**
	 * Instantiates a new user details entity.
	 */
	public UserDetailsEntity() {
		
	}

	/**
	 * Instantiates a new user details entity.
	 *
	 * @param username the username
	 * @param authority the authority
	 * @param zaraUser the zara user
	 */
	public UserDetailsEntity(String username, String authority, UserEntity zaraUser) {
		super();
		this.username = username;
		this.authority = authority;
		this.zaraUser = zaraUser;
	}

	/* (non-Javadoc)
	 * @see com.itc.zara.entity.IEntity#getId()
	 */
	public long getId() {
		return id;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Gets the zara user.
	 *
	 * @return the zara user
	 */
	public UserEntity getZaraUser() {
		return zaraUser;
	}
	
	
	/**
	 * Gets the authority.
	 *
	 * @return the authority
	 */
	public String getAuthority() {
		return authority;
	}


	/**
	 * Sets the authority.
	 *
	 * @param authority the new authority
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
	}


	/* (non-Javadoc)
	 * @see com.itc.zara.entity.IEntity#setId(long)
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * Sets the zara user.
	 *
	 * @param zaraUser the new zara user
	 */
	public void setZaraUser(UserEntity zaraUser) {
		this.zaraUser = zaraUser;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ZaraUserDetails [id=" + id + ", username=" + username
				+ ", authority=" + authority + "]";
	}

}
