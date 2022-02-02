package AdvancedLevelStreamIntrod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMusic {

	public static void main(String[] args) {
		List<String> MusicStyles = List.of("Rap", "POP", "Classical", "Unvilent", "Silent");
		MusicStyles.stream()
		.sorted()
		.forEach(MusicStyle -> System.out.println(MusicStyle));
		
		System.out.println(Stream.of("Rap", "POP", "Classical", "Unvilent", "Silent")
				.collect(Collectors.toList()));
		
		System.out.println("the num of list in array: "+
		Arrays.stream(new double[] {3,4,2,6,45,7,8,93}).count());
		
		IntStream.range(0, MusicStyles.size())
		.forEach(num -> System.out.println((num+ 1) + ". " + MusicStyles.get(num)));
	}

}
