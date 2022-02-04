package AdvancedLevelStreamIntrod;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedApp {

	public static void main(String[] args) {
	List<Integer> LotteryNum = List.of(22, 33, 11, 44, 66);
System.out.println(LotteryNum.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList()));
	}

}
