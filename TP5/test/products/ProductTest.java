package products;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	
	Product traditionalProduct;
	Product cooperativeProduct;
	
	@BeforeEach
	void setUp() throws Exception {
		
		traditionalProduct = new TraditionalProduct("Mandarina", 100);
		cooperativeProduct = new CooperativeProduct("yerba cooperativa", 100);
		
	}

	@Test
	//Cooperative Product
	//returns 0.1 less than a the original price.
	void testCooperativePrice() {
		assertEquals(90, cooperativeProduct.getPrice() );
		
	}
	@Test 
	//Traditional Product
	//returns 0.1 less than a the original price.
	void testTraditionalPrice() {
		
		assertEquals(100, traditionalProduct.getPrice() );
		
	}


}
