package com.onemars.model;

import com.onemars.model.dao.mysql.BDDException;
import com.onemars.model.dao.mysql.UserDAO;

public class User extends UserDAO {
	
	public User() {
		super();
	}
	
	@Override
	public void identifyMe() throws BDDException {
		// TODO Auto-generated method stub
		super.identifyMe();
		this.setStatus(this.getUserId()>0);
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		
		if(userName.length()>10){
			this.getErrors().put("userLogin", "Taille max atteinte.");
		}
		
		if (userName.equals("")){
			this.getErrors().put("userLogin", "Champs vide.");
		}
		
		if(this.getErrors().size()==0) {
			super.setUserName(userName);
		}
		
	}
	
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		
		if(userPassword.length()>20){
			this.getErrors().put("userPassword", "Taille max atteinte.");
		}
		
		if(userPassword.length()<8){
			this.getErrors().put("userPassword", "Mot de pass trop court.");
		}
		
		if ("".equals(userPassword)){
			this.getErrors().put("userPassword", "Champs vide.");
		}
		
		if(this.getErrors().size()==0) {
			super.setUserPassword(userPassword);
		}
		
	}

}
