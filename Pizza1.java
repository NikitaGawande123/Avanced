package AdvancedLevelInnerClass;

import AdvancedLevelEnum.PizzaSize;



	public class Pizza1 {

	    private String name;
	    private PizzaSize pizzaSize;
	    private double price;

	    public Pizza1(String name, PizzaSize pizzaSize) {
	        this.name = name;
	        this.pizzaSize = pizzaSize;
	        this.price = calculatePrice();
	    }

	    class PizzaSlice {
	        public String calculatePizzaSliceArea() {
	            switch (pizzaSize) {
	                case SMALL:
	                default:
	                    return "Small slice";
	                case MEDIUM:
	                    return "Medium slice";
	                case LARGE:
	                    return "Large slice";
	            }
	        }
	    }

	    public PizzaSlice cutPizzaSlice() {
	        return new PizzaSlice();
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

}
