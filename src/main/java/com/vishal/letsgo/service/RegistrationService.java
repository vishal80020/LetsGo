package com.vishal.letsgo.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.letsgo.exception.InvalidCityException;
import com.vishal.letsgo.exception.InvalidEmailException;
import com.vishal.letsgo.exception.InvalidNameException;
import com.vishal.letsgo.exception.InvalidPasswordException;
import com.vishal.letsgo.exception.InvalidPhoneException;
import com.vishal.letsgo.exception.InvalidUserIdException;
import com.vishal.letsgo.exception.LetsGoException;
import com.vishal.letsgo.model.User;
import com.vishal.letsgo.repository.UserRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private UserRepository userRepository;
	
	String regex1 = "^[a-zA-Z0-9]{4,15}+$";
	
	public String registerUser(User user) throws LetsGoException {
		String registrationMessage = null;
		System.out.println(" Inside register User");
		validateUser(user);
		System.out.println("User validation is done");
		registrationMessage = userRepository.registerUser();
		return registrationMessage;
	}
	
	public void validateUser(User user) throws LetsGoException  {
		if(!isValidUserId(user.getUserId()))
			throw new InvalidUserIdException("RegistrationService.INVALID_USER_ID");
		if(!isValidPassword(user.getPassword()))
			throw new InvalidPasswordException("RegistrationService.INVALID_PASSWORD");
		if(!isValidName(user.getName()))
			throw new InvalidNameException("RegistrationService.INVALID_NAME");
		if(!isValidCity(user.getCity()))
			throw new InvalidCityException("RegistrationService.INVALID_CITY");
		if(!isValidEmail(user.getEmail()))
			throw new InvalidEmailException("RegistrationService.INVALID_EMAIL");
		if(!isValidPhoneNumber(user.getPhone()))
			throw new InvalidPhoneException("RegistrationService.INVALID_PHONE_NUMBER");
	}
	
	public Boolean isValidUserId(String userId) {
		Boolean b1 = false;
		
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(userId);
		if(matcher1.matches())
			b1 = true;
		return b1;
	}
	
	public Boolean isValidPassword(String password) {
		Boolean b1 = false;
		String regex2 = "^[a-zA-Z0-9]{8,15}+$";
		
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(password);
		if(matcher2.matches()) 
			b1 = true;
		return b1;
	}
	
	public Boolean isValidName(String name) {
		Boolean b1 = false;
		
		Pattern pattern3 = Pattern.compile(regex1);
		Matcher matcher3 = pattern3.matcher(name);
		if(matcher3.matches())
			b1 = true;
		return b1;
	}
	
	public Boolean isValidCity(String city) {
		Boolean b1 = false;
		Pattern pattern4 = Pattern.compile(regex1);
		Matcher matcher4 = pattern4.matcher(city);
		if(matcher4.matches())
			b1 = true;
		return b1;
	}
	
	public Boolean isValidEmail(String email) {
		Boolean b1 = false;
		String regexp5 = "^[A-Za-z0-9+_.-]+@(.+)$";
		
		Pattern  pattern5 = Pattern.compile(regexp5);
		Matcher matcher5 = pattern5.matcher(email);
		if(matcher5.matches())
			b1 = true;
		return b1;
	}
	
	public Boolean isValidPhoneNumber(String number) {
		Boolean b1 = false;
		String regexp6 = "[0-9]{10}";
		
		Pattern pattern6 = Pattern.compile(regexp6);
		Matcher matcher6 = pattern6.matcher(number);
		if(matcher6.matches())
			b1 = true;
		return b1;
		
	}

}
