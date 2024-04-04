package Rect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MyPoint.PointMain;

class RectTestCase {
	private PointMain point = new PointMain();
	private Rect rect;
	@BeforeEach
	
	void setUp() throws Exception {
		
		point.setX(2);
		point.setY(2);
		
		rect = new Rect(point, 2, 3);
		
	}

	@Test
	public void testArea() {
		assertEquals(rect.getArea(),6);
	}

	public void testPerimeter() {
		assertEquals(rect.getPerimeter(),12);
	}

}
