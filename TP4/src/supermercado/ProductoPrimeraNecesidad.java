package supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String unNombre, double precio, boolean esDePreciosCuidados) {
		super(unNombre,  precio, esDePreciosCuidados);
	
		precio = precio * 0.9;
	}
	
	

}
