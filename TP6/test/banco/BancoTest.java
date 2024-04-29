package banco;
import cliente.*;
import cliente.Credito;
import credito.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {
	
	Banco banco;
	Cliente cliente;
	CreditoPersonal creditoPersonal;
	CreditoHipotecario creditoHipotecario;
	
	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco("Crediticio");
		cliente = new Cliente("Pedro", "Rodriguez", "Av 123", 25 , 125000);
		creditoPersonal = new CreditoPersonal(cliente, 10000, 12);		
		creditoHipotecario = new CreditoHipotecario(cliente, 10000, 12);		
		banco.asociarCliente(cliente);
		banco.recibirSolicitudDeCreditoPersonal   (creditoPersonal);
		banco.recibirSolicitudDeCreditoHipotecario(creditoHipotecario);
	}
	
	// un banco agrega clientes satisfactoriamente
	@Test
	void testClientes() {
		ArrayList clientesDelBanco = banco.getClientes();
		assertTrue( clientesDelBanco.contains(cliente));
	}
	
	@Test
	//un banco agrega una solicitud de prestamo satisfactoriamente (personal)
	void testSolicitudesDePrestamoPersonal() {
		ArrayList solicitudesDelBanco = banco.getSolicitudesDePrestamoPersonal();
		assertTrue( solicitudesDelBanco.contains(creditoPersonal));
	}
	
	@Test
	//un banco agrega una solicitud de prestamo satisfactoriamente (hipotecario)
	void testSolicitudesDePrestamoHipotecario() {
		ArrayList solicitudesDelBanco = banco.getSolicitudesDePrestamoHipotecario();
		assertTrue( solicitudesDelBanco.contains(creditoHipotecario));
	}
	@Test
	//unBanco calcula el monto total de las solicitudes de sus prestamos
	void testMontoTotalDeSolicitudes() {
		double montoTotalPorPrestamos = banco.getMontoTotalPorPrestamosPersonales();
		
		assertEquals(10000.0, montoTotalPorPrestamos);

	}
	
}
