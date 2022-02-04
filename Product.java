package AdvancedLevelStreamIntrod;

public class Product {
	
	private final String name;
	private final String type;
	private final double price;
	private final double ratings;
	
	public Product(String name, String type, double price, double ratings) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.ratings = ratings;
		
	}
	
	public String getName() {return name;}
	public String getType() {return type;}
	public double getPrice() {return price;}
	public double getRatings() {return ratings;}
	
	@Override
	public String toString() {
		return "Product{" +
	"name ='" + name + '\'' +
	",type ='" + type + '\'' +
	",price ='" + price + 
	",ratings ='" + ratings + 
	'}';
	}
}
