package com.example.demo.dao.sp;



import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Component;



@Component
public class SPLogin extends CPStoredProcedure{

	private static final String SP_NAME ="SPAuthenticatioUser" ;
	public static final String OUT_STATUS = "saltStatus";
	public static final String IN_USERNAME ="username" ;
	public static final String IN_PASSWORD ="password" ;
	
	@Autowired
	public SPLogin(JdbcTemplate jdbcTemplate) {
		super(jdbcTemplate, SP_NAME);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void configSP() {
		getSimpleJdbcCall().useInParameterNames(IN_USERNAME).declareParameters(
				new SqlOutParameter(OUT_STATUS, Types.VARCHAR) ,
				new SqlParameter(IN_PASSWORD ,Types.VARCHAR)) ;
	
		
	}
	

}
