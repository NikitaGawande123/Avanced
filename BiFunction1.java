package AdvancedLevelFunctionalProgrammingBInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunction1 {

	public static void main(String[] args) {
		
	BiFunction<Integer, Integer, Double> getPow = (num1, num2) -> Math.pow(num1, num2);
	System.out.println(getPow.apply(4, 3));
	
		
		BiFunction<Integer, Integer, List<Integer>> genList = (size, multi) -> {
		List<Integer> genrtedList = new ArrayList<>();
			for(int i= 0; i< size; i++) {
				genrtedList.add(i * multi);
			}
			
			return genrtedList;
		};
		System.out.println(genList.apply(4, 3));
		
	}


	}


