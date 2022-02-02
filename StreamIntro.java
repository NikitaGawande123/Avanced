package AdvancedLevelStreamIntrod;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntro {

	public static void main(String[] args) {
		List<Integer> temps =List.of(16, 16, 16, 17, 19, 19, 16);
        System.out.print(temps.stream()
       .filter(temp -> temp > 16 && temp < 19)
       // .sorted(Comparator.reverseOrder())
        .count());
        //.collect(Collectors.toList()));

	}

}
