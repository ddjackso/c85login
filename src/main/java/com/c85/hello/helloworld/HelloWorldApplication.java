package com.c85.hello.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer 
{
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(HelloWorldApplication.class);
	}
    public static void main( String[] args )
    {
    	SpringApplication.run(HelloWorldApplication.class, args);
    }
}
