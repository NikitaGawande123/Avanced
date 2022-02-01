package AdvancedLevelFunctionalProgrammingBInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		Consumer<Integer> Multi = num -> System.out.println(num*8);
		Multi.accept(10);

		Consumer<List<Integer>> MultiNum = list -> {
			for(int i= 0; i< list.size(); i++) {
				list.set(i, list.get(i) * 5);
			}
		};
		
		List<Integer> num = Arrays.asList(5, 4, 3, 2, 1);
		MultiNum.accept(num);
		System.out.println(num);
		
	}

}
