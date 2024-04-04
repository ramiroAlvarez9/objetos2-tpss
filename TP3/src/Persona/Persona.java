package Persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private LocalDate fnac;

	public Persona(String nombre, LocalDate fnac) {
		this.nombre = nombre;
		this.fnac = fnac;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		Period period = Period.between(this.fnac, LocalDate.now());
		return period.getYears();
	}

	public boolean menorQue(Persona persona) {
		return ( this.getEdad() < persona.getEdad() );
	}
	
	
	
	
}
