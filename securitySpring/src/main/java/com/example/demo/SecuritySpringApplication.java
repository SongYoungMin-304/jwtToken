package com.example.demo;
import java.util.Date;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.security.core.Authentication;

import com.example.demo.model.UserDetailCustom;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@SpringBootApplication
public class SecuritySpringApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SecuritySpringApplication.class, args);
		
		
	}

	 @Bean
	    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
	        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource);
	        
	        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");
	        sessionFactory.setMapperLocations(res);
	        
	        return sessionFactory.getObject();
	    }
}
