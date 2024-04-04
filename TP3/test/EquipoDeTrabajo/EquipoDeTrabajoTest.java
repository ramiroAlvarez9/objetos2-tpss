package EquipoDeTrabajo;
import  Persona.Persona;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	private EquipoDeTrabajo superSonicos;
	private Persona pepe;
	private Persona raul;
	@BeforeEach
	void setUp() throws Exception {
		
		raul         = new Persona("pepe", LocalDate.parse("1982-08-25"));
		pepe         = new Persona("pepe", LocalDate.parse("1994-08-25"));
		superSonicos = new EquipoDeTrabajo("los supersonicos");
		
		superSonicos.agregarIntegrante(pepe);
		superSonicos.agregarIntegrante(raul);
		
		
	}

	@Test
	//equipo de trabajo tiene nombre
	public void testNombreEquipo() {
		assertEquals(superSonicos.getNombre(), "los supersonicos" );
	}
	
	@Test
	//equipo de trabajo puede calcular el promedio de edad de sus integrantes
		public void testPromedioDeEdad() {
			assertEquals(superSonicos.promedioDeEdadDelEquipo(), 35);
	}
	
}
