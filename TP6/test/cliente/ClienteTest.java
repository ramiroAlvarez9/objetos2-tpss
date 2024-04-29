package cliente;
import credito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import banco.Banco;

class ClienteTest {

	Cliente cliente;
	Banco   banco;
	CreditoPersonal creditoPersonal;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Pedro", "Rodriguez", "Av 123", 25 , 125000);
		banco = new Banco("Crediticio");
		creditoPersonal = new CreditoPersonal(cliente, 100000, 12);
		
		cliente.solicitarCreditoA_deTipoPersonal(banco, creditoPersonal);
	}

	@Test
	//Un cliente puede solicitar un credito Personal.
	void testClienteSolicitandoCreditoPersonal() {
	
		ArrayList<credito.Credito> creditos = cliente.getCreditosSolicitados();
		assertTrue(  creditos.contains(creditoPersonal) );			
	
	}
	
	@Test
	//un cliente solicita un credito personal y es aceptado por el banco solicitado.
	void testClienteSolicitandoCreditoPersonalTieneSuCreditoAceptado() {
		
		ArrayList creditosAceptados = banco.getSolicitudesDePrestamoPersonal();
		assertTrue(  creditosAceptados.contains(creditoPersonal) );			
	
	}
	
	

}
