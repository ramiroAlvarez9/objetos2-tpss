package examinandoexpresiones;

public class ExaminadorMain {

	public static void main(String[] args) {
		
		
		String a = "abc";
		String s = a;
		String t;
		
		System.out.println(s.length()); //Devuelve el largo del string
		
		//t.length(); //No esta inizializada la variable
		
		System.out.println(1 + a); //Concatena un numero al array string
		
		System.out.println(a.toUpperCase()); //Convierte a Mayusculas las letras
		
		"Libertad".indexOf("r"); // devuelve la posicion de r en el array
		
		System.out.println("Universidad".lastIndexOf('i')); //Devuelve la posicion del elemento que aparezca de ultimo.
		
		System.out.println("Quilmes".substring(2,4));  //Recorta el string
		
		System.out.println((a.length() + a).startsWith("a")); //Tests if this string starts with the specified prefix.
		
		System.out.println(s == a); // compara strings
		
		a.substring(1,3).equals("bc"); //compara si dos strings son iguales.

	}

}
