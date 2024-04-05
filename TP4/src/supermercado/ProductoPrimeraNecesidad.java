package supermercado;

/*
 * 
Suponga ahora que el descuento a aplicar en cada producto de primera necesidad puede ser distinto y se debe poder definir al momento de
crear el mismo. Por ejemplo, el arroz puede ser un producto de primera necesidad con un descuento del 8%, mientras que leche podría ser otro
producto de primera necesidad con un decuento del 11%. Esto es sólo un ejemplo. El descuento a aplicar en cada producto de primera
necesidad debe ser configurable al momento de crearlo.


1. Modifique los tests para contemplar esta variación.
2. Implemente la solución en Java.

*/
public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String unNombre, double precio, boolean esDePreciosCuidados, double descuentoParaAplicar) {
		
		super(unNombre, precio, esDePreciosCuidados);
		this.precio = this.precio * descuentoParaAplicar;
	
	}
	
	


}