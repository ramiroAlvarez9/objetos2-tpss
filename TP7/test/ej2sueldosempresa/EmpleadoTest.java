package ej2sueldosempresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	EmpleadoTemporario empleadoTemporario;
	EmpleadoPasante empleadoPasante;
	EmpleadoPermanente empleadoPermanente;
	
	@BeforeEach
	void setUp() throws Exception {
	
		empleadoTemporario = new EmpleadoTemporario("Roberto perez", 30, false, 0);
		empleadoPasante    = new EmpleadoPasante("Juan Galvan", 40, false, 0);
		empleadoPermanente = new EmpleadoPermanente("Federico perez", 40, false, 5);
		empleadoTemporario.calcularSueldo();
		empleadoPasante.calcularSueldo();
		empleadoPermanente.calcularSueldo();
	}

	@Test
	//el sueldo de un empleado temporario es de 1000.5
	void testSueldoEmpleadoTemporario() {
		assertEquals(1000.5, empleadoTemporario.sueldo());
	}
	@Test
	//el sueldo de un empleado pasante es de 1600
	void testSueldoEmpleadoPasante() {
		assertEquals(1600, empleadoPasante.sueldo());
	}
	@Test
	//el sueldo de un empleado permanente es de 3500
	void testSueldoEmpleadoPermanente() {
		assertEquals(3262.5, empleadoPermanente.sueldo());
	}

}
