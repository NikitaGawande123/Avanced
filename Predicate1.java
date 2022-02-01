package AdvancedLevelFunctionalProgrammingBInterface;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		Predicate<String> MoreTand5Let = text -> text.length() > 5;
		Predicate<String> startsWithWel = text -> text.startsWith("Welcome");

		boolean isMoreThan5Let = MoreTand5Let.test("Welcome");
		System.out.println("The text typed longer than 5 letters: " +isMoreThan5Let);
		
		boolean isstartsWithWel = startsWithWel.test("Welcome");
		System.out.println("The text typed is starts with \"Welcome\": " +isstartsWithWel);
		
		boolean isLessTand5Let = MoreTand5Let.negate().test("Welcome");
		System.out.println("The text typed is less than 5 letters: " +isLessTand5Let);
		
		boolean isCombinedAnd = MoreTand5Let.and(startsWithWel).test("Welcome");
		System.out.println("The text typed longer than 5 letters and starts with \"Welcome\" : " +isCombinedAnd);
		
		boolean isCombinedOr = MoreTand5Let.or(startsWithWel).test("Welcome");
		System.out.println("The text typed longer than 5 letters or starts with \"Welcome\" : " +isCombinedOr);
		
		
		
		
	}

}
