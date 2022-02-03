package AdvancedLevelMethodReferenceInstanceObj;

import java.util.List;

public class MainPer2 {

	public static void main(String[] args) {
		
		List<Person1> People  = List.of(
				new Person1("Nick", 24),
				new Person1("Durga", 22),
				new Person1("Amar", 25));
		
		PersonComProv compProv = new PersonComProv();
		People.stream() 
		.sorted(compProv::compareByNameAndAge)
		.forEach(System.out::println);
		


	}

}
