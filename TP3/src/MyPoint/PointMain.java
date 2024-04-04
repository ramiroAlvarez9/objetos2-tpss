package MyPoint;

public class PointMain {
	
	int x = 0;
	int y = 0;
	
	public void setX(int numberForX){
		this.x = numberForX;
	}
	
	public void setY(int numberForY) { 
		this.y = numberForY;
	}
	
	public int getPositionX() {
		return this.x;
	}
	
	public int getPositionY(){
		
		return this.y;
		
	}
	
	public void sumToX(int number) {
		
		this.x = x + number;
		
	}
	
	public void sumToY(int number) {
		
		this.y = y + number;
		
	}
	
	public PointMain createNewPointFromOtherPoint( PointMain otherPoint) {
		
		PointMain point = new PointMain();
		
		point.setX(this.x);
		point.setY(this.y);
		
		point.sumToX(otherPoint.getPositionX());
		point.sumToY(otherPoint.getPositionY());
		
		return point;
		
		
		
			
		
	}

}



/* 
class MyPoint {

	int x = 0;
	int y = 0;
	
	public void setX(int numberForX){
		this.x = numberForX;
	}
	
	public void setY(int numberForY) { 
		this.y = numberForY;
	}
	
	public int getPositionX() {
		return this.x;
	}
	
	public int getPositionY(){
		
		return this.y;
		
	}
	
	public void sumToX(int number) {
		
		this.x = x + number;
		
	}
	
	public void sumToY(int number) {
		
		this.y = y + number;
		
	}
	
	public MyPoint createNewPointFromOtherPoint( MyPoint otherPoint) {
		
		MyPoint point = new MyPoint();
		
		point.setX(this.x);
		point.setY(this.y);
		
		point.sumToX(otherPoint.getPositionX());
		point.sumToY(otherPoint.getPositionY());
		
		return point;
		
		
		
			
		
	}

	
}
*/ 