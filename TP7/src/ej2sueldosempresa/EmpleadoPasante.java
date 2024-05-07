package ej2sueldosempresa;

public class EmpleadoPasante extends Empleado{

	public EmpleadoPasante(String nyap, int horasTrabajadas, boolean tieneConyuge, int cantHijos) {
		super(nyap, horasTrabajadas, tieneConyuge, cantHijos);
		this.sueldo = 1000;
	}
	
	@Override
	public void calcularSueldo() {
		
		
	}
	
	
	
}
