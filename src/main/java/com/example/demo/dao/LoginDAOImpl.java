package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.example.demo.dao.sp.SPLogin;

@Component
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SPLogin sPLogin;
	
	@Override
	public String ValidateEmploy(String username, String password) {
		
		
		SqlParameterSource in = new MapSqlParameterSource().addValue(SPLogin.IN_USERNAME, username) ;
		
		return null ;
		
	}

}
