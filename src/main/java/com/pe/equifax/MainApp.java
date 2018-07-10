package com.pe.equifax;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;





@SpringBootApplication
public class MainApp extends SpringBootServletInitializer {
	
	   final static Logger logger = Logger.getLogger(MainApp.class);
		
	   @Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(MainApp.class);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainApp.class, args);

	}
}
