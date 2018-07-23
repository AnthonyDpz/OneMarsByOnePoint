package com.onemars.beans.convertors;

import com.onemars.beans.UserBean;
import com.onemars.model.User;

public class UserBeanConverter {
	
	//Convertion d'un user en Bean
	public static UserBean convertToBean(User user) throws Exception {
		
		UserBean userBean = new UserBean();
		
		userBean = MyBeanConverter.convertToBean(user, userBean);
		
		return userBean;

	}
	
	//Convertion d'un Bean en User + récupération de l'Id en base
	public static User convertFromBean(UserBean userBean) throws Exception {
		
		User user = new User();
		
		user = MyBeanConverter.convertFromBean(userBean, user);
		
		user.identifyMe();
		
		return user;

	}

}
