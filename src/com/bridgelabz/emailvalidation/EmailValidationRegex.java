package com.bridgelabz.emailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationRegex {

	static String[] emails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com",

			"abc.@gmail.com", "abc123@.com", "abc123@gmail.a", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
			"abc@gmail.com.1a", "abc.@gmail.com" };

	public static void validateEmailsList(String[] emailList) {

		System.out.println("Validating all sample emails in the list");
		for (int i = 0; i < emailList.length; i++) {
			Pattern pattern = Pattern
					.compile("^[a-zA-Z0-9]{1,}[.+-]?[a-zA-Z0-9]{1,}?[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,}){1,}$");
			Matcher matcher = pattern.matcher(emailList[i]);
			if (matcher.matches())
				System.out.println(emailList[i] + " : This Email id is valid");
			else
				System.out.println(emailList[i] + " : This Email id is Invalid");
		}
	}

	public static void main(String[] args) {

		EmailValidationRegex.validateEmailsList(emails);

	}

}
