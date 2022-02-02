package AdvancedLevelFunctionalProgrammingBInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperator1 {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(operationList(num, nums -> nums*3));
		
		List<String> Let = Arrays.asList("a","b","c");
		System.out.println(operationList(Let, Lets -> Lets+Lets));

	}
	
	private static <T>List<T> operationList(List<T> list, UnaryOperator<T> operator ){
		List<T> result = new ArrayList<>();
		for(T listElment : list) {
			result.add(operator.apply(listElment));
		}
		return result;
	}

}
