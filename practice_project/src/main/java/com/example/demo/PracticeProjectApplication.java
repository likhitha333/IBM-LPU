package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.Dao;
import com.example.dao.DaoImpl;

@SpringBootApplication
@Configuration

public class PracticeProjectApplication {

	private static Dao dao;
	{
		dao = new DaoImpl();
	}
	
	public static void main(String[] args) {
//		SpringApplication.run(PracticeProjectApplication.class, args);
//		ApplicationContext context = new ClassPathXmlApplicationContext();
		System.out.println(dao.getPersonInfo());
	}

}
