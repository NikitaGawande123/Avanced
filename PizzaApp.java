package AdvancedLevelEnum;

public class PizzaApp {
	
	 public static void main(String[] args, String name "Margarita") throws CloneNotSupportedException {
	        System.out.println("Available sizes:");
	        for (PizzaSize pizzaSize : PizzaSize.values()) {
	            System.out.println("- " + pizzaSize.getPizzaSizeText());
	        }
	        System.out.println();

	        Pizza pizzaOrder = new Pizza("Margareta", PizzaSize.MEDIUM);
	        System.out.println("I ordered the following pizza:");
	        System.out.println("Name: " + pizzaOrder.getName());
	        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
	        System.out.println("Price: $" + pizzaOrder.getPrice());
	        
	        Pizza samePizza = (Pizza) pizzaOrder.clone();
	        System.out.println("I ordered onather pizza:");
	        System.out.println("Name: " + samePizza.getName());
	        System.out.println("Size: " + samePizza.getPizzaSize().getPizzaSizeText());
	        System.out.println("Price: $" + samePizza.getPrice());
	        
	      
	        System.out.println(pizzaOrder.equals(pizzaOrder));
	        
	    }


}
