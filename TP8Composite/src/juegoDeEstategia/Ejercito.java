package juegoDeEstategia;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements PersonajeDeJuego{
	
    private List<PersonajeDeJuego> personajesOEjercitos = new ArrayList<PersonajeDeJuego>();
    
    public void addPersonajeOEjercito(PersonajeDeJuego personajeOEjercito) {
        personajesOEjercitos.add(personajeOEjercito);
    }
    
    public void removePersonajeOEjercito(PersonajeDeJuego personajeOEjercito) {
        personajesOEjercitos.remove(personajeOEjercito);
    }
    
    public List<PersonajeDeJuego> getPersonajesOEjercitos() {
        return personajesOEjercitos;
    }

	@Override
	public void caminar() {
		
		for (PersonajeDeJuego personaje : personajesOEjercitos) {
				personaje.caminar();
		}
	
	}
}
