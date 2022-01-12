package AdvancedLevelEnum;

import java.util.Objects;

public class Pizza implements Cloneable {

	
	 private String name;
	    private PizzaSize pizzaSize;
	    private double price;

	    public Pizza(String name, PizzaSize pizzaSize) {
	        this.name = name;
	        this.pizzaSize = pizzaSize;
	        this.price = calculatePrice();
	    }

	    private double calculatePrice() {
	        switch (pizzaSize) {
	            case SMALL:
	            default:
	                return 5.99;
	            case MEDIUM:
	                return 7.99;
	            case LARGE:
	                return 10.99;
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    public PizzaSize getPizzaSize() {
	        return pizzaSize;
	    }

	    public double getPrice() {
	        return price;
	      
}
	    @Override
	   protected Object clone() throws CloneNotSupportedException {
		   return super.clone();
	   }
	    @Override
	    public boolean equals(Object O) {
	    	if (this == O) return true;
	    	if (O == null || getClass() != O.getClass()) return false;
	    	Pizza pizza = (Pizza) O;
	    	return Double.compare(pizza.price, price) == 0 &&
	    			Objects.equals(name, pizza.name) &&
	    			pizzaSize == pizza.pizzaSize;
	    	
	    }
	    
	    @Override
	    public int hashCode() {
	    	return Objects.hash(name, pizzaSize, price);
	    }
	    
}