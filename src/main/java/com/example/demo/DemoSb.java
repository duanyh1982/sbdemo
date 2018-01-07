package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.String;

@SpringBootApplication
public class DemoSb {

	public static void main(String[] args) {
		SpringApplication.run(DemoSb.class, args);
	}

	public String str_prop;
	public String str_prop2;

	public String str_prop3;

}
