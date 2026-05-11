package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.annotation.PostConstruct;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
    @PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(DemoApplication.class);
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }

}

