package AdvancedLevelMethodReferenceStaticRfrncMtd;

import java.util.Comparator;

public class PersonComProv2 {

	public static int compareByNameAndAge(Person2 person11, Person2 person22) {
		return Comparator.comparing(Person2::getName)
		.thenComparing(Person2::getAge)
		.compare(person11, person22);
		
	}

	
}
