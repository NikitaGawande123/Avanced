package AdvancedLevelTreeSet;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		
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
		System.out.println("returns the first food from list : " +food.first());
		System.out.println("returns the last food from list: " +food.last());
		System.out.println("returns the first poll food: " +food.pollFirst());
		System.out.println("returns the last food: " +food.pollLast());
		System.out.println("after returns the lastPoll and firstPoll food: " +food);
		
		System.out.println();
		System.out.println("returns descending set of food: " +food.descendingSet());
		System.out.println("returns descending set of food: " +food.size());
	}

}
