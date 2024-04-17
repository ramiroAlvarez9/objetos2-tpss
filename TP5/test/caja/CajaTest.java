package caja;
import factura.Factura;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import products.CooperativeProduct;
import products.Product;
import products.TraditionalProduct;
import products.Service;

class CajaTest {
	
	Product traditionalProduct;
	Product cooperativeProduct;
	Caja    caja;
	Factura factura;
	Service service;
	@BeforeEach
	void setUp() throws Exception {
		
		factura = new Factura ("electricidad", 200);
		service = new Service ("electricidad", 20 , 10);
		
		caja = new Caja();
		traditionalProduct = new TraditionalProduct("Mandarina", 100);
		cooperativeProduct = new CooperativeProduct("yerba cooperativa", 100);
		
		caja.addProduct(cooperativeProduct);
		caja.addProduct(traditionalProduct);
		
	
	}
	
	
	@Test
	//Length of elements in the stack of products
	void sizeOfProducts() {
		assertEquals( 2 , caja.sizeProducts() );
	}
	
	@Test
	//total price of products in caja
	void totalPriceInCaja() {
		assertEquals( 190 , caja.totalPriceOfProducts() );
		
	}
	@Test
	//Testing if payService returns Factura object.
	void payServiceReturnsFactura() {
		
		assertEquals(factura, caja.payService(service) );
		
	}


}
