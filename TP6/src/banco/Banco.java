package banco;
import  cliente.*;
import  credito.*;

import java.util.List;

public class Banco implements administracionBanco{

	private String nombre;
	private List <Credito> solicitudesPrestamo;
	private List <Cliente> clientes;
	
	public Banco(String nombre) {
		
		this.nombre = nombre;
	
	}
	
	public void asociarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void recibirSolicitudDeCredito(Credito credito) {
		solicitudesPrestamo.add(credito);
	}
	
}
