package Persona;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona juan;
	Persona pedro;
	@BeforeEach
	
	void setUp() throws Exception {
	
		juan  = new Persona("Juan", LocalDate.parse("1992-08-25"));
		pedro = new Persona("Pedro", LocalDate.parse("1994-08-25"));
	
	}

	@Test
	//persona tiene un nombre
	public void testNombre() {
		assertEquals(juan.getNombre(), "Juan");
		assertEquals(pedro.getNombre(), "Pedro");
	}
	@Test
	public void testEdad() {
		assertEquals(juan.getEdad(), 31);
		assertEquals(pedro.getEdad(), 29);
	}
	@Test
	public void testPersonaEsMenorQueOtra() {
		assertEquals( pedro.menorQue(juan) , true);
	}
}
