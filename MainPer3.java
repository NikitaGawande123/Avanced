package AdvancedLevelMethodReferenceStaticRfrncMtd;

import java.util.List;

import AdvancedLevelMethodReferenceInstanceObj.Person1;
import AdvancedLevelMethodReferenceInstanceObj.PersonComProv;

public class MainPer3 {

	public static void main(String[] args) {
		
		List<Person2> People  = List.of(
				new Person2("Nick", 24),
				new Person2("Durga", 22),
				new Person2("Amar", 25));
		
		
		People.stream() 
		.sorted(PersonComProv2::compareByNameAndAge)
		.forEach(System.out::println);
		



	}

}
