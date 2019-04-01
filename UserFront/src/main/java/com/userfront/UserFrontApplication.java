package com.userfront;

import java.util.Collections;
import java.util.Date;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserFrontApplication {

//	@PostConstruct
//    public void init(){
//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));   // It will set UTC timezone
//        System.out.println("Spring boot application running in UTC timezone :"+new Date());   // It will print UTC timezone
//    }
	public static void main(String[] args) {
		
        SpringApplication app = new SpringApplication(UserFrontApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8085"));
        app.run(args);
        
		//SpringApplication.run(UserFrontApplication.class, args);
	}

}
