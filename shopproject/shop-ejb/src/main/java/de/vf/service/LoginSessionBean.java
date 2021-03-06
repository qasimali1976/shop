package de.vf.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

import de.vf.model.User;

/**
 * Session Bean implementation class LoginSessionBean
 */
@Stateless
public class LoginSessionBean implements LoginSession{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1634237237125020455L;
	private User user = new User();

	@PostConstruct
	private void init() {
		System.out.println("post Construct ************************************ ");
	}
	
	
	@PreDestroy
	private void preDestory() {
		System.out.println("pre Destroy *************************************** ");
	}
	
	@Override
	public User getUser() {
		
		return user;
	}

	@Override
	public void setUser(User u) {
		this.user=u;
		
	}

	
}
