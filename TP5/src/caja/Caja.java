package caja;

import products.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import factura.*;
import products.*;


public class Caja implements AgenciaRecaudadora {

	private Stack<Product> products = new Stack<Product>();	
	private ArrayList<Factura> facturas = new ArrayList<Factura>();

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
	
	public Factura payService(Service service) {
		
		Factura factura = new Factura(service.getName(), service.totalPrice());
		return factura;
	}
	
	public void registrarPago(Factura factura) {
		
		facturas.add(factura);
	
	}

}
