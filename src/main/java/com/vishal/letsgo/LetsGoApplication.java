package com.vishal.letsgo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties.Registration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.vishal.letsgo.model.User;
import com.vishal.letsgo.service.RegistrationService;

@SpringBootApplication
@PropertySource(value = {"classpath:configuration.properties" })
public class LetsGoApplication implements CommandLineRunner {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(LetsGoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			User user = new User();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter user id: ");
			String uid = sc.next();
			System.out.println("Enter password: ");
			String pwd = sc.next();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter city: ");
			String city = sc.next();
			System.out.println("Enter email: ");
			String email = sc.next();
			System.out.println("Enter phone: ");
			String phone = sc.next();
			user.setUserId(uid);
			user.setPassword(pwd);
			user.setName(name);
			user.setCity(city);
			user.setEmail(email);
			user.setPhone(phone);
			RegistrationService service = (RegistrationService)applicationContext.getBean("registrationService"); //Class Name with first letter small case
			String registrationMessage = service.registerUser(user);
			System.out.println("After registration :  registration completed: " + registrationMessage);
			System.out.println(environment.getProperty(registrationMessage));
		} catch(Exception e) {
			System.out.println(environment.getProperty(e.getMessage()));
		}
		
	}

}
 