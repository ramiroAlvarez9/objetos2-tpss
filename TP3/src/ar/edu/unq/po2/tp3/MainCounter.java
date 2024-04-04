package ar.edu.unq.po2.tp3;
import java.util.ArrayList;


public class MainCounter {

	public static void main(String[] args) {

	}

}

class Counter {
	
	private ArrayList< Integer > numeros = new ArrayList<>(10);	
	private ArrayList< Integer > pares   = new ArrayList<>(10);	
	private ArrayList< Integer > impares = new ArrayList<>(10);	

	public void addNumber(Integer unNumero) {
		this.numeros.add(unNumero );
	}
	
	public void agregarNumeroSiEsPar(int numero) {
		
		if( this.numeros.get(numero) % 2 == 0)  pares.add(numeros.get(numero)); 
		
	}
	public void agregarNumeroSiEsImpar(int numero) {
		
		if( this.numeros.get(numero) % 2 != 0)  impares.add(numeros.get(numero)); 
		
	}
	public int cantidadDePares() {
		
		for (int i = 0; i < numeros.size(); i++) agregarNumeroSiEsPar(i); 
		
		System.out.println("La cantidad de pares en la lista es de"+" "+ this.pares.size() );
		 
		return this.pares.size();
		
	}
	
	public void cantidadDeImpares() {
		for (int i = 0; i < numeros.size(); i++) agregarNumeroSiEsImpar(i); 
		System.out.println("La cantidad de impares en la lista es de" +" "+ this.impares.size() );
	
	}
	
	
}