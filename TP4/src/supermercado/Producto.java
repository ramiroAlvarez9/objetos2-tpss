package supermercado;

public class Producto {
	
	private String  nombre;
	public double  precio;
	private boolean esDePreciosCuidados = false;
	
	
	public Producto(String unNombre, double precio, boolean esDePreciosCuidados){
		
		this.nombre = unNombre;
		this.precio = precio;
		this.esDePreciosCuidados = esDePreciosCuidados;
	}
	
	public Producto(String unNombre, double precio) {
		
		this.nombre = unNombre;
		this.precio = precio;
	}
	
	public double aumentarPrecio(double unAumento) {  
	
		double nuevoPrecio = this.precio += unAumento; 
		
		return nuevoPrecio;
	}
	
	public String getNombre() { return this.nombre; }
	
	public double getPrecio() { return this.precio; }
	
	public boolean esPrecioCuidado() { return this.esDePreciosCuidados; }

}

