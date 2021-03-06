package com.org.prj.mod.myservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//@EnableAutoConfiguration
@SpringBootApplication

public class MyserviceApplication extends SpringBootServletInitializer {
	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(MyserviceApplication.class);
	   }

	public static void main(String[] args) {
		SpringApplication.run(MyserviceApplication.class, args);
	}

}
