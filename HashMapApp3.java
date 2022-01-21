package AdvancedLevelHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp3 {

	public static void main(String[] args) {
		
Map<String, String> capitals = new HashMap<>();
		
		capitals.put("England", "Lundon");
		capitals.put("India", "New Delhi");
		capitals.put("Russia", "Moscos");
		capitals.put("England", "Oslo");
		
			System.out.println("the capital of england is: " + capitals.get("England"));
			capitals.remove("England", "Oslo");
			System.out.println("the capital of england is: " + capitals.get("England"));
			
			if(capitals.containsValue("Moscos")) {
				System.out.println("Russia is in the list.");
			}
			
			capitals.put(null, "the city is not in the list");
			String userInput = "Paris";
			if(capitals.containsKey(userInput)) {
				System.out.println(capitals.get(userInput));
			}
			else {
				System.out.println(capitals.get(null));
			}
			
			System.out.println(capitals.getOrDefault(userInput, "the city is not on the list"));
			
			capitals.replace("India", "Delhi");
			System.out.println("the replace capital of India is: " + capitals.get("India"));
			
			capitals.putIfAbsent(userInput, "Wokanda");
			capitals.remove(null);
			System.out.println(capitals.size() + " the following contries found in a map: ");
			for(String country: capitals.keySet()) {
				System.out.println("-" + country);
			}
			capitals.clear();
			System.out.println(capitals.size() + " the following capitals found in the map:");
			for(String capital: capitals.values()) {
				System.out.println("-" + capital);
				
			}



	}

}
