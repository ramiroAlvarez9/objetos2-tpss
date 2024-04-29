package cliente;

import java.util.ArrayList;

import banco.Banco;
import credito.Credito;
import credito.CreditoPersonal;
import propiedad.Propiedad;

public class Cliente implements SueldoDePersona {

	private String nombre;
	private String apellido;
	private String direccion;
	private int    edad;
	private double  sueldoNetoMensual;
	private ArrayList<Credito> creditosAceptados = new ArrayList<Credito>();
	private ArrayList<Propiedad> propiedades = new ArrayList<Propiedad>();
	private ArrayList<Credito>   solicita    = new ArrayList<Credito>();
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual) {
		this.nombre            = nombre;
		this.apellido          = apellido;
		this.direccion         = direccion;
		this.edad              = edad;
		this.sueldoNetoMensual = sueldoNetoMensual; 
	}

	public double sueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	public double sueldoNetoAnual() {
		return (this.sueldoNetoMensual() ) * 12;		
	}
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	public void solicitarCreditoA_deTipoPersonal(Banco banco, CreditoPersonal credito) {
		
		solicita.add(credito);
		
		banco.recibirSolicitudDeCreditoPersonal(credito);
		
		
	}
	public ArrayList<Credito> getCreditosSolicitados(){
		return solicita;
	}
	
	public ArrayList<Credito> getCreditosAceptados(){ return creditosAceptados; }

}
