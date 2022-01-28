package AdvancedLevelFunctionalProgrammingPart1;

public class FunctionProg1 {

	public static void main(String[] args) {
		Functions1 msgSrvc = new Functions1();
		Greeter greeter;
		boolean isLoggedInUser = false;
		if(isLoggedInUser) {
			greeter = new LoggedInGreeter();
		}
		else {
			greeter= new GuestUser();
		}
		
		msgSrvc.greet(greeter);
		
		
	}

}
