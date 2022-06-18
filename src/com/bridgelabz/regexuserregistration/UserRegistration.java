package com.bridgelabz.regexuserregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	// public final String firstName = "^[A-Z]{3}[a-z]*{2,}$";
	public final String firstName = "^[A-Z]{1}[a-z]{2,}$";
	public final String lastName = "^[A-Z]{1}[a-z]{2,}$";
	public final String email = "^[a-z]{3,}(.[a-z]{3,})*@[a-z]{2,}.[a-z]{2,3}(.[a-z]{2})*$";
	public final String mobileNumber = "^[0-9]{2}\s?[0-9]{10}$";
	public final String passWord = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";

	public void validateFirstName(String userFirstName) {
		Pattern pattern = Pattern.compile(firstName);
		Matcher matcher = pattern.matcher(userFirstName);
		if (matcher.matches())
			System.out.println("Entered firstName " + userFirstName + " is valid");
		else
			System.out.println("firstName " + userFirstName + " is invalid");
	}

	public void validateLastName(String userlastName) {
		Pattern pattern = Pattern.compile(lastName);
		Matcher matcher = pattern.matcher(userlastName);
		if (matcher.matches())
			System.out.println("Entered lastname " + userlastName + " is valid");
		else
			System.out.println("Entered lastname " + userlastName + " is invalid");
	}

	public void validateEmail(String userEmail) {
		Pattern pattern = Pattern.compile(email);
		Matcher matcher = pattern.matcher(userEmail);
		if (matcher.matches())
			System.out.println("Entered Email is " + userEmail + " is valid");
		else
			System.out.println("Entered email is " + userEmail + " is invalid");

	}

	public void validateMobileNumber(String userMobile) {
		Pattern pattern = Pattern.compile(mobileNumber);
		Matcher matcher = pattern.matcher(userMobile);
		if (matcher.matches())
			System.out.println("Entered Mobile num is " + userMobile + " is valid");
		else
			System.out.println("Entered mobile number is " + userMobile + " is invalid");
	}

	public void validatePassword(String userPassword) {
		Pattern pattern = Pattern.compile(passWord);
		Matcher matcher = pattern.matcher(userPassword);
		if (matcher.matches())
			System.out.println("Entered password is " + userPassword + " is valid");
		else
			System.out.println("Entered password is " + userPassword + " is invalid");
	}

	public void validateEmailsList(String[] emailList) {
		for (int i = 0; i < emailList.length; i++) {
			Pattern pattern = Pattern.compile(email);
			Matcher matcher = pattern.matcher(emailList[i]);
			if (matcher.matches())
				System.out.println(emailList[i] + " : This Email id is valid");
			else
				System.out.println(emailList[i] + " : This Email id is Invalid");
		}
	}

}
