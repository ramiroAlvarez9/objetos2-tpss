package counterpackage;
import java.util.ArrayList;


public class MainCounter {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(10);
		
		counter.cantidadDePares();
		counter.cantidadDeImpares();
		

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
	public void cantidadDePares() {
		
		for (int i = 0; i < numeros.size(); i++) agregarNumeroSiEsPar(i); 
		
		System.out.println("La cantidad de pares en la lista es de"+" "+ this.pares.size() );
		
		
	}
	
	public void cantidadDeImpares() {
		for (int i = 0; i < numeros.size(); i++) agregarNumeroSiEsImpar(i); 
		System.out.println("La cantidad de impares en la lista es de" +" "+ this.impares.size() );
	
	}
	
	
}