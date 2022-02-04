package AdvancedLevelStreamIntrod;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToCollect1 {

	public static void main(String[] args) {
		List<String> fruits = List.of("Apple","Banana","Kiwi","Pineapple","Apple","Banana");

		Set<String> availableFruits = fruits.stream()
				.filter(fruit -> fruit.startsWith("a"))
				.collect(Collectors.toSet());
		
		System.out.println("Available Fruits: ");
		System.out.println(availableFruits);
		
		Collection<String> fruitBoxes = fruits.stream()
				.collect(Collectors.toCollection(LinkedList::new));
		//.collect(Collectors.toCollection(TreeSet::new));
		
		
		System.out.println("fruit Boxes");
		System.out.println(fruitBoxes);
		
		Map<String, String> fruitNames = fruits.stream()
				.distinct()
				.collect(Collectors.toMap(Function.identity(), String::toUpperCase));
		System.out.println("Fruit Name with Upper case : ");
		System.out.println(fruitNames);
		
		
	}

}
