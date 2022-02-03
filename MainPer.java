package AdvancedLevelMethodReference;

import java.util.Comparator;
import java.util.List;

public class MainPer {

	public static void main(String[] args) {
		List<Person> People  = List.of(
				new Person("Nick", 24),
				new Person("Durga", 22),
				new Person("Amar", 25));
		
		People.stream() 
		//.sorted((Person1, Person2) -> Person1.getAge().compareTo(Person2.getAge()))
		.sorted(Comparator.comparing(Person::getAge))
		.forEach(System.out::println);
		

	}

}
