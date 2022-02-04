package AdvancedLevelStreamIntrod;

import java.util.List;

public class StreamFilter {

	public static void main(String[] args) {
		
		List<Product> Food = List.of(
				new Product("Roll", "Veg", 100, 5),
				new Product("Pizza", "Non-Veg", 60, 9),
				new Product("Burger", "Veg", 70, 9),
				new Product("Standwich", "Non-Veg", 60, 4),
				new Product("Pasta", "Veg", 90, 7),
				new Product("Qubab", "Non-Veg", 100, 6)
				);
Food.stream()
.filter(Foods -> Foods.getPrice() > 10 && Foods.getType().equals("Veg"))
.forEach(System.out::println);
	}

}
