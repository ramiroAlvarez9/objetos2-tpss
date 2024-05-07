package ej2sueldosempresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	EmpleadoTemporario empleadoTemporario;
	
	@BeforeEach
	void setUp() throws Exception {
	
		empleadoTemporario = new EmpleadoTemporario("Roberto perez", 30, false, 0);
		empleadoTemporario.calcularSueldo();
	}

	@Test
	//el sueldo de un empleado temporario es de 1000.5
	void testSueldoEmpleadoTemporario() {
		assertEquals(1000.5, empleadoTemporario.sueldo());
	}
	@Test
	//el sueldo de un empleado temporario es de 1000.5
	void testSueldoEmpleadoPasante() {
		assertEquals(1000.5, empleadoTemporario.sueldo());
	}
	

}
