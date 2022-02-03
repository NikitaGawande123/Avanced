package AdvancedLevelMethodReferenceStaticRfrncMtd;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainPer3 {

	public static void main(String[] args) {
		
		List<Person2> People  = List.of(
				new Person2("Nick", 24),
				new Person2("Durga", 22),
				new Person2("Amar", 25));
		
		
		People.stream() 
		.sorted(PersonComProv2::compareByNameAndAge)
		.forEach(System.out::println);
		

		List<Integer> num = List.of(11, 32, 45, 23, 65, 34);
		Set<Integer> numSet = CllectionTransformer.transform(num, 	HashSet::new);
		System.out.println(numSet);
		
		Set<Person2> PersonSet = CllectionTransformer.transform(People, TreeSet::new);
		System.out.println(PersonSet);

	}

}
