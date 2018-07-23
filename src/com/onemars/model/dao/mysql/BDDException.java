package com.onemars.model.dao.mysql;

public class BDDException extends Exception {
	
	private static final long serialVersionUID = -1158974380783097374L;
	private int errorCode;
	 
	public BDDException(String message,int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	 
	public int getErrorCode() {
		return errorCode;
	}

}
