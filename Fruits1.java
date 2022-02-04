package AdvancedLevelStreamIntrod;

import java.util.List;
import java.util.stream.Collectors;

public class Fruits1 {

	public static void main(String[] args) {
		List<String> Types = List.of("Apple","Banana","Kiwi","Pineapple","Apple","Banana");
		List<String> availableFruits =  Types.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Available Fruits");
		System.out.println(availableFruits);
				

	}

}
