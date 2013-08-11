package com.tbf.memac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Authenticator {

	@Autowired
	private javax.sql.DataSource dataSource;
	
	boolean isUserValid(String userName, String pwd) {

		// TODO: authentication
		
		return true;
	}
}
