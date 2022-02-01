package AdvancedLevelFunctionalProgrammingBInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Consumer1 {

	public static void main(String[] args) {
		BiConsumer<String, Integer> MultiAtribute = (text, num) -> System.out.println(text+num);
		MultiAtribute.accept("Stock: ", 10);
		MultiAtribute.accept("Price: $", 1800);
		
		BiConsumer<List<Integer>, Integer> MultiNum = (list, num) -> {
			for(int i= 0; i< list.size(); i++) {
				list.set(i, list.get(i) * num);
			}
		};
		
		List<Integer> num = Arrays.asList(5, 4, 3, 2, 1);
		MultiNum.accept(num, 6);
		System.out.println(num);
		
	}

}
