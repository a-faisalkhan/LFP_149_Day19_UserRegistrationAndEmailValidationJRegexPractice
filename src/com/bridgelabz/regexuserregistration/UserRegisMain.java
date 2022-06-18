package com.bridgelabz.regexuserregistration;

import java.util.Scanner;

public class UserRegisMain {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the user information program");
        UserRegistration compare = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Validate first name\t 2. Validate last name\t 3. Validate email id\t 4. Validate mobile number\t 5. Validate Password\t 6. Validate  Emails in the list that provided");
        int chooseOption = scanner.nextInt();
        
        switch (chooseOption) {
        case 1:
            System.out.println("Enter first name");
            String firstName = scanner.next();
            compare.validateFirstName(firstName);
            break;
        case 2:
            System.out.println("Enter last name");
            String lastName = scanner.next();
            compare.validateLastName(lastName);
            break;
        case 3:
            System.out.println("Enter email id");
            String emailId = scanner.next();
            compare.validateEmail(emailId);
            break;
        case 4:
            System.out.println("Enter mobile number");
            String mobileNumber = scanner.next();
            compare.validateMobileNumber(mobileNumber);
            break;
        case 5:
            System.out.println("Enter password");
            String passWord = scanner.next();
            compare.validatePassword(passWord);
            break;
        case 6:
            System.out.println("Validating all sample emails in the list");
            String[] emails = {
                    "abc@yahoo.com",
                    "abc111@abc.com",
                    "abc.qwe@abc.com.au",
                    "abc@1.com",
                    "abc@gmail.co.in",
                    "abc.@gmail.com",
                    "xyz@outlook.in",
                    "abc..2002@gmail.com",
                    "Bridgelabz@gmail.com.1a",
                    "bridgelabz.newbatch@bridgelabz.co"
            };
            compare.validateEmailsList(emails);
            break;
    }
	}

}
