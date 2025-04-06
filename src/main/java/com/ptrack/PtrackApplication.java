package com.ptrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PtrackApplication {
	public static void main(String[] args) {
		SpringApplication.run(PtrackApplication.class, args);
	}

}
