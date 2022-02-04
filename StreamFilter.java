package AdvancedLevelStreamIntrod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Product> cheapFood = new ArrayList<>();
        Food.stream()
        .filter(Foods ->Foods.getPrice()< 90)
        .forEach(cheapFood ::add);
        System.out.println(cheapFood);
        
        Map<Integer, Product> SmartWatches = new HashMap<>();
        SmartWatches.put(1, new Product("Samosa", "Veg", 20, 9));
        
        SmartWatches.entrySet().stream()
        .filter(Product -> Product.getValue() != null &&
        Product.getValue().getType().equals("Veg")) 
        .forEach(Product -> System.out.println(Product.getValue().getName() + "-" +
        Product.getValue().getType() + "- $" + Product.getValue().getPrice()));
		
	}
}
