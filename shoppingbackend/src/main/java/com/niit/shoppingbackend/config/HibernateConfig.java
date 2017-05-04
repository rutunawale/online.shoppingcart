package com.niit.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.niit.shoppingbackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	
	
	
   //Changes the below based on the DBMS you choose
	private final static String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshoppingcart";
	private final static String DATABASE_DRIVER ="org.h2.Driver";
	private final static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME="sa";
	private final static String DATABASE_PASSWORD="";

	//dataSource bean will be available
	@Bean
	public DataSource getDataSource() {
		
	  DriverManagerDataSource dataSource = new DriverManagerDataSource();
	  
	  
	  //Providing the database connection information
	  dataSource.setDriverClassName(DATABASE_DRIVER);
	  dataSource.setUrl(DATABASE_URL);
	  dataSource.setUsername(DATABASE_USERNAME);
	  dataSource.setPassword(DATABASE_PASSWORD);
	  
	  
	  
	  
	  return dataSource;
	}
	
	//sessionFactory bean will be available
	
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.niit.shoppingbackend.dto");
		
		
		
		return builder.buildSessionFactory();
	
	}
	
	//All the hibernate properties will be returned in this method
	private Properties getHibernateProperties() {
		
		Properties properties =new Properties();
		
		properties.put("hibernate.dialect",DATABASE_DIALECT);
		properties.put("hibernate.show_sql","true");
		properties.put("hibernate.format_sql","true");
		
		return properties;
	}
	//transaction Manager Bean
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
		
	}
	
	
	
}
	
	
	
	
	
	
	

