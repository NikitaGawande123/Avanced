package AdvancedLevelInnerClass;

import AdvancedLevelEnum.PizzaSize;



public class InnerClassPizza {
	
	 private static boolean isPizzaReady(int waitedInMinutes) {
	        class Oven {
	            public boolean isPizzaBakedProperly() {
	                if (waitedInMinutes > 30) {
	                    return true;
	                }
	                return false;
	            }
	        }
	        Oven oven = new Oven();
	        return oven.isPizzaBakedProperly();
	    }
	
	 public static void main(String[] args) {
	        Pizza1 firstPizza = new Pizza1("Margherita", PizzaSize.MEDIUM);
	        System.out.println("Name: " + firstPizza.getName());
	        Pizza1 secondPizza = new Pizza1("Margherita", PizzaSize.MEDIUM) {
	            @Override
	            public String getName() {
	                return "Anonymous";
	            }
	        };
	        System.out.println("Name: " + secondPizza.getName());
	        
	        if (isPizzaReady(40)){
	            System.out.println("The pizza is ready.");
	        } else {
	            System.out.println("The pizza is not ready yet.");
	        }

	        Pizza1 thirdPizza = new Pizza1("Pizza cake", PizzaSize.LARGE);
	        Pizza1.PizzaSlice pizzaSlice = secondPizza.cutPizzaSlice();
	        System.out.println(pizzaSlice.calculatePizzaSliceArea());
	    }

}



