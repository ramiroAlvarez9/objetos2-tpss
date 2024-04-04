package desarmandonumeros;

import java.util.ArrayList;

public class DesarmandoNumerosMain {

	/* 
	 *  Diseñe e implemente una función Java que reciba un arreglo de números enteros y
		devuelva el número que tiene la mayor cantidad de dígitos pares. No puede utilizar
		String!!. Por lo cual, debe razonar cómo desarmar el número utilizando los operadores
		de los números enteros (div y mod).
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		
		
		
		
		AnalizadorDeNumeros analizador = new AnalizadorDeNumeros();
		
		analizador.agregarNumero(3333333);
		analizador.agregarNumero(5394128);
		
		analizador.numeroConMayorDigitosPares();
		
		
		
	}
	

}


class AnalizadorDeNumeros {
	
	private int digitosParesNumero1;
	private int digitosParesNumero2;
	
	private ArrayList< Integer > numeros = new ArrayList<>(2);
	
	public AnalizadorDeNumeros() {
		
		this.digitosParesNumero1 = 0;
		this.digitosParesNumero2 = 0;
	}
	
	
	
	public void agregarNumero(int num) {
		numeros.add(num);
	}
	
	
	
	public int contarDigitosPares(int numeroDeArrayList) {
			
	        int contador = 0;    
	        
	        while (numeroDeArrayList != 0) {
	  
	            int digito = numeroDeArrayList % 10;
	            
	            if (digito % 2 == 0) {
	                contador++;
	            }
	            
	            numeroDeArrayList /= 10;
	        }
	        return contador;
	  }
	
	 public int numeroConMayorDigitosPares() {
		 
	        int numeroDeParesMaximoActual = 0;
	        int numeroConMayorDigitoDePares = 0;
	        
	        for (int i = 0 ; i < this.numeros.size(); i++) {
	        	
	        	int conteoDePares = contarDigitosPares( this.numeros.get(i) );
	            
	            if (conteoDePares > numeroDeParesMaximoActual  ) {
	            	numeroDeParesMaximoActual    = conteoDePares;
	                numeroConMayorDigitoDePares  = this.numeros.get(i) ;
	            }
	        }
	        
	        System.out.println(numeroConMayorDigitoDePares);
	        
	        return numeroConMayorDigitoDePares;
	        
	}
	  
	
	 

}

