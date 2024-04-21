package cliente;



public class Cliente implements SueldoDePersona {

	private String nombre;
	private String apellido;
	private String direccion;
	private int    edad;
	
	public Cliente(String nombre, String apellido, String direccion, int edad) {
		this.nombre    = nombre;
		this.apellido  = apellido;
		this.direccion = direccion;
		this.edad      = edad;
	}
	public double sueldoNetoMensual() {
		
	}
	public double sueldoNetoAnual() {
		
	}
	

}
