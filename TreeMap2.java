package AdvancedLevelTreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		
	
		TreeMap<String, Double> prodPriceLinkedTreeMap = new TreeMap();
		prodPriceLinkedTreeMap.put("chocolate bar", 1.5);
		prodPriceLinkedTreeMap.put("cheese bar", 1.3);
		prodPriceLinkedTreeMap.put("wash bar", 1.2);
		prodPriceLinkedTreeMap.put("apple", 1.7);
		prodPriceLinkedTreeMap.put("lemon", 1.5);
		prodPriceLinkedTreeMap.put("Teabox", 1.5);
		prodPriceLinkedTreeMap.put("Birdbox", 1.5);
		
		System.out.println("Hash code of the map: " +prodPriceLinkedTreeMap.hashCode()); 
		System.out.println("TreeMap: ");
		//for(String product : prodPriceLinkedTreeMap.descendingKeySet()) {
		//System.out.println(product + " $" + prodPriceLinkedTreeMap.get(product));
			
			NavigableMap<String, Double> prodPriceDecOrd = prodPriceLinkedTreeMap.descendingMap();
			for(String product : prodPriceDecOrd.descendingKeySet()) {
				System.out.println(product + " $" + prodPriceDecOrd.get(product));
		}
	}
	}



