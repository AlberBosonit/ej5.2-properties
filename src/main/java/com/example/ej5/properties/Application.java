package com.example.ej5.properties;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	Properties properties;
	@Autowired
	Environment environment;

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("El valor de greeting es: "+properties.getGreeting());
		System.out.println("El valor de my.number es: "+properties.getMyNumber());
		System.out.println("El valor de new.property es: "+properties.getNewProperty());
		String javaHome = environment.getProperty("JAVA_HOME");
		System.out.println(javaHome);

	}
}
