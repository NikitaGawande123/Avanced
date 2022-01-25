package AdvancedLevelTreeSet;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> food = new TreeSet<>();
		
		food.add("Pizza");
		food.add("Sandwich");
		food.add("Burger");
		food.add("Momos");
		food.add("Rolls");
		System.out.println("The original menu of foods: " +food);

		System.out.println();
		System.out.println("returns the lower list food: " +food.lower("Pizza"));
		System.out.println("returns the floor list food: " +food.floor("Pizza"));
		System.out.println("returns the higher list food: " +food.higher("Pizza"));
		System.out.println("returns the ceiling list food: " +food.ceiling("Pizza"));
		
		System.out.println();
		System.out.println("returns the Tail set food: " +food.tailSet("Pizza"));
		System.out.println("returns the lower list food: " +food.headSet("Pizza"));
		System.out.println("returns the lower list food: " +food.subSet("Pizza", "Momos"));
	}

}
