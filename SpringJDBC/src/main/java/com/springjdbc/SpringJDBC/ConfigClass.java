package com.springjdbc.SpringJDBC;


import com.springjdbc.SpringJDBC.*;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages ="com.springjdbc.springJDBC" )

public class ConfigClass {
	
	@Bean(name = {"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource ds =new  DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("tarun@1234");
		return ds;
	}
	
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
		
	}

//    @Bean(name = {"studentdaoimpl"})
//	public StudentDao getStudentDao() {
//		StudentDao studentdaoimpl =  new StudentDaoImpl(getTemplate());		
//		return studentdaoimpl;
//	}
}
