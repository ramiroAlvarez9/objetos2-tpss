package Rect;
import MyPoint.PointMain;

public class RectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
/* 
1. Crearse en forma apropiada y asegurando su consistencia.
2. Obtener el área
3. Obtener el perímetro.
4. Determinar si son horizontales o verticales.
*/

class Rect {
	
	
	private PointMain initialPoint;
	private int height;
	private int width;
	
	
	public Rect(PointMain initialPoint, int height, int width){
	
		this.initialPoint = initialPoint;
		this.height       = height;
		this.width        = width;
		
	}
	
	public void getInitialPoint() {
		
		System.out.println(this.initialPoint.getPositionX());
		System.out.println(this.initialPoint.getPositionY());

		
	}
	
	public int getArea()          { return (this.height * this.width); }
	
	public int getPerimeter()     { return ( 2 * this.height ) + (2 * this.width); }
	
	public boolean isVertical()   { return this.height > this.width; }
	
	public boolean isHorizontal() {return this.width > this.height; }
}