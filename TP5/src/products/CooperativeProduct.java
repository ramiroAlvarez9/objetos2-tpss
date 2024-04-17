package products;

public class CooperativeProduct extends Product {
	
	public CooperativeProduct(String name, double price) {
		this.name  = name;
		this.price = price - (price * 0.1); 
	}
	
}
