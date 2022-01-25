package AdvancedLevelEnumSet;

import java.util.EnumSet;

public class EnumSet1 {
	enum PizzaSize {
		Small, Medium, Larg, Extra_Large, family;
	}
	public static void main(String[] args) {
		
		EnumSet<PizzaSize> PizzaSizes = EnumSet.allOf(PizzaSize.class);
		System.out.println("Available Pizza sizes: " +PizzaSizes);
		
		EnumSet<PizzaSize> BasicPizzaSizes = EnumSet.noneOf(PizzaSize.class);
		BasicPizzaSizes.add(PizzaSize.Small);
		BasicPizzaSizes.add(PizzaSize.Larg);
		BasicPizzaSizes.add(PizzaSize.Medium);
		System.out.println("Available Basic Pizza sizes: " +BasicPizzaSizes);
		
		EnumSet<PizzaSize> BasicPizzaSizes1 = EnumSet.of(PizzaSize.Small, PizzaSize.Larg, PizzaSize.Medium);
		System.out.println("Available Basic Pizza sizes: " +BasicPizzaSizes1);
		
		EnumSet<PizzaSize> MiddlePizzaSizes = EnumSet.range(PizzaSize.Medium, PizzaSize.Extra_Large);
		System.out.println("Available Middle Pizza sizes: " +MiddlePizzaSizes);
		}

	}


