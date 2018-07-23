package com.onemars.beans;

import java.util.HashMap;

public class UserBean extends MyBean {
	
	private String userName;
	private String userPassword;
	private int userId;
	private boolean status;
	private boolean isAdmin;
	private HashMap<String,String> errors;
	
	public UserBean() {
		
		this.userName = "Visitor";
		this.userPassword = "";
		this.userId = -5;
		this.status = false;
		this.isAdmin = false;
		this.errors = new HashMap<String,String>();
	}
	
	//Creation du bean from formulaire
	public UserBean(String userName, String userPassword) {
		
		this.userName = userName;
		this.userPassword = userPassword;
		this.userId = -5;
		this.status = false;
		this.isAdmin = false;
		this.errors = new HashMap<String,String>();
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the isAdmin
	 */
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * @return the errors
	 */
	public HashMap<String, String> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(HashMap<String, String> errors) {
		this.errors = errors;
	}
	
}
