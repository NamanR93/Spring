package com.sp.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sp.main.Dao.StudentDao;
import com.sp.main.Dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages= {"com.sp.main.Dao"})
public class SpringConfig {

	
	@Bean
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/springjdbc_db");
		datasource.setUsername("root");
		datasource.setPassword("numun.23!");
		
		return datasource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
	}
	
	
		
	
}
