package com.onemars.model.dao.mysql;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.HashMap;

import com.onemars.model.dao.mysql.BDDException;
import com.onemars.model.dao.mysql.ConnexionBDD;
import com.onemars.model.User;
import com.onemars.model.dao.MyDao;
import com.onemars.model.dao.MyDaoInterface;

public class UserDAO extends MyDao{
	
	//Objet coté serveur
	private String userName;
	private String userPassword;
	private int userId;
	private boolean status = false;
	private boolean isAdmin = false;
	private HashMap<String, String>errors = new HashMap<String,String>();

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

	@Override
	public void identifyMe() throws BDDException {
		
		int errorCode = 10000;
		
		try{
			
			String sql = "{call ps_identifyuser(?,?,?,?)}";
			CallableStatement call = ConnexionBDD.getConnexion().prepareCall(sql);
			call.setString(1, userName);
			
			call.setString(2, userPassword);
			
			call.registerOutParameter(3, Types.INTEGER);
			call.registerOutParameter(4, Types.INTEGER);
			call.execute();
			errorCode = call.getInt("ret");
			
			if(errorCode==0) {

				call.getMoreResults(Statement.KEEP_CURRENT_RESULT);
				userId = call.getInt(4);

			}
			else {
				//TODO faire une remonté d'erreur via un futur beanError
			}

			if (errorCode == 10000) throw new BDDException("ExceptionSQL dans la procedure",10000);
		}
		catch (SQLException e){
			// gerer le code d'erreur SQL
			e.printStackTrace();
			throw new BDDException(e.getMessage(),e.getErrorCode());
		}
	}
	
}
