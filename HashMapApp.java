package AdvancedLevelHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		
		Map<String, String> capitals = new HashMap<>();
		
		capitals.put("England", "Lundon");
		capitals.put("India", "New Delhi");
		capitals.put("Russia", "Moscos");
		capitals.put("England", "Oslo");
		
			System.out.println("the capital of england is: " + capitals.get("England"));
			capitals.remove("England", "Oslo");
			System.out.println("the capital of england is: " + capitals.get("England"));

	}

}
