package EquipoDeTrabajo;

import java.util.ArrayList;

import Persona.*;


class EquipoDeTrabajo {

	

	private String nombre;
	private ArrayList<Persona> integrantes = new ArrayList<>();

	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarIntegrante(Persona persona) {
		integrantes.add(persona);
	}
	
	public double promedioDeEdadDelEquipo() {

		int edadTotalEquipo = 0;
		for (Persona persona : this.integrantes) {

			edadTotalEquipo += persona.getEdad();
		}

		return edadTotalEquipo / this.integrantes.size();
	}

	public void mostrarPromedioDeEdadDelEquipo() {

		System.out.println(this.promedioDeEdadDelEquipo());

	}

}
