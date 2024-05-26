package ej2sueldosempresa;

public class EmpleadoPermanente extends Empleado {

	public EmpleadoPermanente(String nyap, int horasTrabajadas, boolean tieneConyuge, int cantHijos) {
		super(nyap, horasTrabajadas, tieneConyuge, cantHijos);
		this.sueldoBasico = 3000;
	}
	
	@Override
	public void calcularSueldo() {
		double plusPorHijos = 150 * this.cantHijos;
		double sueldoSinDescuentos = this.sueldoBasico + plusPorHijos;
				
		this.sueldo = sueldoSinDescuentos - (sueldoSinDescuentos * this.descuentosPrevisionales());
	}

}
