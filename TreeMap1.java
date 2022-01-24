package AdvancedLevelTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
	
		System.out.println("HashMap: ");
		Map<String, Double> prodPriceHashMap = new HashMap<>();
		prodPriceHashMap.put("chocolate bar", 1.5);
		prodPriceHashMap.put("cheese bar", 1.3);
		prodPriceHashMap.put("wash bar", 1.2);
		prodPriceHashMap.put("apple", 1.7);
		prodPriceHashMap.put("lemon", 1.5);
		
		for(String product : prodPriceHashMap.keySet()) {
			System.out.println(product + " $" + prodPriceHashMap.get(product));
			
		}
		System.out.println();
		System.out.println("LinkedHashMap: ");
		Map<String, Double> prodPriceLinkedHashMap = new LinkedHashMap<>();
		prodPriceLinkedHashMap.put("chocolate bar", 1.5);
		prodPriceLinkedHashMap.put("cheese bar", 1.3);
		prodPriceLinkedHashMap.put("wash bar", 1.2);
		prodPriceLinkedHashMap.put("apple", 1.7);
		prodPriceLinkedHashMap.put("lemon", 1.5);
		
		for(String product : prodPriceLinkedHashMap.keySet()) {
			System.out.println(product + " $" + prodPriceLinkedHashMap.get(product));
			
			
		}
		System.out.println();
		System.out.println("TreeMap: ");
		Map<String, Double> prodPriceLinkedTreeMap = new TreeMap();
		prodPriceLinkedTreeMap.put("chocolate bar", 1.5);
		prodPriceLinkedTreeMap.put("cheese bar", 1.3);
		prodPriceLinkedTreeMap.put("wash bar", 1.2);
		prodPriceLinkedTreeMap.put("apple", 1.7);
		prodPriceLinkedTreeMap.put("lemon", 1.5);
		
		for(String product : prodPriceLinkedTreeMap.keySet()) {
			System.out.println(product + " $" + prodPriceLinkedTreeMap.get(product));
			
			
		}

	}

}
