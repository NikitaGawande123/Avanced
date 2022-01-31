package AdvancedLevelFunctionalProgrammingPart2;

import java.util.Scanner;

public class FunctionProg2 {
	
	public static void main(String[] args) {
		Functions2 msgSrvc = new Functions2();
		Scanner userScanner = new Scanner(System.in);
		String userStatus = userScanner.nextLine();
		
		Greeter1 greeter;
		if("Guest".equals(userStatus)) {
			greeter = ()-> System.out.println("My name is nikita, Welcom to our application!");
		}
		 else if("LoggedIn".equals(userStatus)) {
			greeter = ()-> System.out.println("Welcome Back");
		}
		 else {
			 greeter = ()-> System.out.println("Unknown User Status");
		 }
		
		//Greeter1 LoggedInGreeter1 = ()-> System.out.println("Welcome Back");
		msgSrvc.greet(greeter);
		//greeter.perform();
		//LoggedInGreeter1.perform();
		
		
		
		}
		
	}

