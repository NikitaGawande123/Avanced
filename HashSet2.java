package AdvancedLevelHashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<String> food = new HashSet<>();
		
		food.add("Pizza");
		food.add("Sandwich");
		food.add("Burger");
		food.add("Momos");
		food.add("Rolls");
		System.out.println("The original menu of foods: " +food);
		
Set<String> newFood = new HashSet<>();
		
newFood.add("cheesRoll");
newFood.add("chees Sandwich");
		newFood.add("veg-Burger");
		newFood.add("chicken Momos");
		newFood.add("veg-roll");
		
		food.addAll(newFood);
		System.out.println("After adding new food in the menu: " + food);
		
Set<String> Leastordfood = new HashSet<>();
		
Leastordfood.add("cheesRoll");
Leastordfood.add("kachori");
Leastordfood.add("samosa");
Leastordfood.add("Dosa");
Leastordfood.add("aaloo bonda");
		System.out.println("The least order foods from menu: " +food.containsAll(Leastordfood));
		
		//food.retainAll(Leastordfood);
		//System.out.println("retain foods: " + food);
		
		food.removeAll(Leastordfood);
		System.out.println("The least order foods from menu are out: " +food);
		
		

	}

}
