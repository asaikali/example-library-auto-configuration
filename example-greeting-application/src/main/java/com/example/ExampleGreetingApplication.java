package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleGreetingApplication {

	/*
	@Bean
	Greeter greeter()
	{
		 Greeter greeter = new GreeterBuilder().setName("Adib").setMessage("Hello").build();
		 return greeter; 
	}
	*/

    public static void main(String[] args) {
        SpringApplication.run(ExampleGreetingApplication.class, args);
    }
}
