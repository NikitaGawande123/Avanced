package AdvancedLevelFunctionalProgrammingPart1;

public class GuestUser implements Greeter  {
	
	@Override
	public void perform() {
		System.out.print("Welcome to our App, Please create an account.");
	}

}
