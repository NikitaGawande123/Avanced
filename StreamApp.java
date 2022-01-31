package AdvancedLevelFunctionalProgrammingStreamT;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {

	public static void main(String[] args) {
		List<Integer> inputNum = List.of(1, 2, 3, 4, 5);
		List<Integer> outputNum = inputNum
				.stream()
			
				.map(num -> num * num)
				.filter(num -> num >3)
				.collect(Collectors.toList());
		
		System.out.print(outputNum);
	}

}
