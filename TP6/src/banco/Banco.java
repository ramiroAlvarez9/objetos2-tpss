package banco;
import  cliente.*;
import cliente.Credito;
import  credito.*;

import java.util.ArrayList;
import java.util.List;

public class Banco implements administracionBanco{

	private String nombre;
	private ArrayList  <CreditoPersonal> solicitudesPrestamoPersonal       = new ArrayList<CreditoPersonal>();
	private ArrayList  <CreditoHipotecario> solicitudesPrestamoHipotecario = new ArrayList<CreditoHipotecario>();
	public  ArrayList  <Cliente> clientes = new ArrayList<Cliente>();
	
	public Banco(String nombre) { this.nombre = nombre; }
	
	public void asociarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	public void recibirSolicitudDeCreditoPersonal(CreditoPersonal credito) {
		
		if(credito.cumpleRequisitos()) {
			
			solicitudesPrestamoPersonal.add(credito);
		}
		
	}
	public void recibirSolicitudDeCreditoHipotecario(CreditoHipotecario credito) {
		solicitudesPrestamoHipotecario.add(credito);
	}
	
	public ArrayList<CreditoPersonal> getSolicitudesDePrestamoPersonal(){
		return solicitudesPrestamoPersonal;
	}
	public ArrayList<CreditoHipotecario> getSolicitudesDePrestamoHipotecario(){
		return solicitudesPrestamoHipotecario;
	}
	public double getMontoTotalPorPrestamosPersonales() {
		
		double total = 0;
		
		
		for(CreditoPersonal credito: solicitudesPrestamoPersonal ) {
		      total += credito.getMontoSolicitado();
		}
		
		return total;
		
	}
	
}
