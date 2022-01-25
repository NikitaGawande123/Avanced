package AdvancedLevelHashSet;

import java.util.HashSet;
import java.util.Set;


public class HashSet1 {

	public static void main(String[] args) {

		Set<String> food = new HashSet<>();
		
		food.add("Pizza");
		food.add("Sandwich");
		food.add("Burger");
		food.add("Momos");
		food.add("Rolls");
		food.add("Pizza");
		
		//food.clear();
		food.remove("rolls");
		System.out.println(food);
		System.out.println("Momos is available in the menu:  " + food.contains("Momos"));
		System.out.println(food.size());
		
		System.out.println();
		System.out.println("we have following foods available now");
		for(String foods : food) {
			System.out.println("-" + foods.toUpperCase());
		}
		
		
		
		
		

	}

}
