package AdvancedLevelStreamIntrod;

import java.util.List;
import java.util.stream.Collectors;

public class MapApp {

	public static void main(String[] args) {
		
		List<String> Names = List.of("Naagin", "Dhoom", "Twilight", "Dhoom2");
		List<String> namesCap = Names.stream()
				.map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .collect(Collectors.toList());
		System.out.println("Cap Names : ");
		System.out.println(namesCap);
	}

}
