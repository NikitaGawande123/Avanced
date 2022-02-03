package AdvancedLevelMethodReferenceInstanceObj;

import java.util.Comparator;

public class PersonComProv {
	
	public int compareByNameAndAge(Person1 person11, Person1 person22) {
		return Comparator.comparing(Person1::getName)
		.thenComparing(Person1::getAge)
		.compare(person11, person22);
		
	}

}
