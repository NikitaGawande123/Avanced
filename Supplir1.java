package AdvancedLevelFunctionalProgrammingBInterface;

import java.util.Random;
import java.util.function.Supplier;

public class Supplir1 {

	public static void main(String[] args) {
	Supplier<Integer> randomNum = () -> {
		Random randomNumGen = new Random();
		return randomNumGen.nextInt(1000)+1;
	};
	System.out.println(randomNum.get());

	}

}
