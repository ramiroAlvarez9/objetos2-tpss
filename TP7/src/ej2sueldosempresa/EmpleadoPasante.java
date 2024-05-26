package ej2sueldosempresa;

public class EmpleadoPasante extends Empleado{

	public EmpleadoPasante(String nyap, int horasTrabajadas, boolean tieneConyuge, int cantHijos) {
		super(nyap, horasTrabajadas, tieneConyuge, cantHijos);
	}
	
	@Override  
	public void calcularSueldo() {
		
		this.sueldo = this.horasTrabajadas * 40;
		
	}
	
	
	
	
	
}
