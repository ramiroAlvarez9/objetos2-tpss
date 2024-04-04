package supermercado;

import java.util.ArrayList;

public class Supermercado {
	public String nombre;
	public String direccion;
	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto unProducto) {
		productos.add(unProducto);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	public double getPrecioTotal() {
		
		double precioTotalDeProductos = 0;
		
		for (Producto producto: productos) {
			precioTotalDeProductos += producto.getPrecio();
		}
		return precioTotalDeProductos;
	}
}
