package chp18;

class Point implements Cloneable {
	int xPos,yPos;
	
	Point (int x, int y){
		xPos=x;
		yPos=y;
	}
	public void showPosition() {
		System.out.printf("[%d, %d]" , xPos, yPos);
		
	}
    public Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
    
    public void changePos(int x, int y) {
    	xPos=x;
    	yPos=y;

    }
	
}


class Rectangle implements Cloneable {
	Point upperLeft, lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1,y1);
		lowerRight= new Point(x2,y2);
	}
	
	public void showPosition() {
		System.out.println("직사각형 위치정보..");
		System.out.print("좌 상단 : ");
		upperLeft.showPosition();
		System.out.println("");
		System.out.print("우 하단 :");
		lowerRight.showPosition();
		System.out.println("\n");
		
	}
	public void changePos (int x1, int x2, int y1, int y2 ) {
		upperLeft = new Point(x1,y1);
		lowerRight= new Point(x2,y2);
		
	}
	
	 public Object clone() throws CloneNotSupportedException {
	    	return super.clone();
	    }
	
	
}


public class clonemm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  /*
	Point omg= new Point(10,20);
    Point cpy;
    
    try {
    	cpy =(Point)omg.clone();
    	omg.showPosition();
    	cpy.showPosition();
    } catch (CloneNotSupportedException e) {
    	e.printStackTrace();
    }
    
    
    */
		Rectangle org= new Rectangle(2, 1, 10, 10);
		Rectangle cpy;
		
		try{
			cpy=(Rectangle)org.clone();
			org.changePos(5, 10, 20, 20);
			org.showPosition();
			cpy.showPosition();
			
			
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
