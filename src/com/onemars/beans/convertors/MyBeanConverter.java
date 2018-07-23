package com.onemars.beans.convertors;

import org.apache.commons.beanutils.BeanUtils;

import com.onemars.beans.MyBean;
import com.onemars.beans.UserBean;
import com.onemars.model.User;
import com.onemars.model.dao.MyDaoInterface;

public class MyBeanConverter {
	
	//Convertisseur Génériques d'objet web en objet server et inversement
	
	public static <T extends MyBean, U extends MyDaoInterface>T convertToBean(U src, T target) throws Exception {
		
		BeanUtils.copyProperties(target, src);
		
		return target;
	}
	
	public static <T extends MyBean, U extends MyDaoInterface >U convertFromBean(T src, U target) throws Exception {
		
		BeanUtils.copyProperties(target, src);
		
		return target;
	}


}
