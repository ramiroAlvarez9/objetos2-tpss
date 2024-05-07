package ej2sueldosempresa;

public class EmpleadoTemporario extends Empleado {
	
	public EmpleadoTemporario(String nyap, int horasTrabajadas, boolean tieneConyuge, int cantHijos) {
		super(nyap, horasTrabajadas, tieneConyuge, cantHijos); 	
		this.sueldoBasico = 1000;
	}

	@Override
	public void calcularSueldo() 
	{
		int pagoPorConyugeOhijos = 0;
		
		double sueldoSinDescuentos  = ( this.sueldoBasico +  (5 * this.horasTrabajadas) + pagoPorConyugeOhijos );
		
		double descuentosParaSueldo = sueldoSinDescuentos * this.descuentosPrevisionales();
		
		if (this.tieneConyuge || this.cantHijos > 0) { pagoPorConyugeOhijos = 100; }
		
		System.out.println(sueldoSinDescuentos);
		
		this.sueldo =  sueldoSinDescuentos - descuentosParaSueldo ;
		
		
		System.out.println(this.sueldo);
		
	}
	
	public double sueldo() {
		return this.sueldo;
	}
	
	

	
}
