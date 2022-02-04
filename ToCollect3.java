package AdvancedLevelStreamIntrod;

import java.util.List;
import java.util.stream.Collectors;

public class ToCollect3 {

	public static void main(String[] args) {
		
		List<String> PlayerName = List.of("Amar","Kartik","Durga");
		List<Integer> PlayerDamage = List.of(11,33,22,55,44,77,66);
		List<Double>PlayerDamageDouble = List.of(1.2,1.4,1.3,1.6,1.6,1.8);
		
		System.out.println("Player Names : " +String.join(",", PlayerName ));
		System.out.println("Player Damage : " +PlayerDamage.stream()
		.map(Object::toString)
		.collect(Collectors.joining(",")));

		
		Long NumOfHits = (long) PlayerDamage.size();
				
		System.out.println("Num of hits :" + NumOfHits );
		
		Integer overallDamage = PlayerDamageDouble.stream()
				.collect(Collectors.summingInt(Double::intValue));
		System.out.println("Overall Damage :" + overallDamage );
		
	}

	}

	
