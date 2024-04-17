package caja;

import products.*;

import java.util.Iterator;
import java.util.Stack;

public class Caja {

	private Stack<Product> products = new Stack<Product>();

	
	// add product to products:
	public void addProduct(Product product) {
		products.push(product);
	}

	public int sizeProducts() {
		return products.size();	
	}
	
	// makes the SUM to ALL products in "products"
	public double totalPriceOfProducts() {
		
		Iterator<Product> productIterator = products.iterator();
		
		
		double total = 0;
		
		while (productIterator.hasNext()) {
			Product product = productIterator.next(); 
			total += product.getPrice();
			
		}
		return total;
	}

}
