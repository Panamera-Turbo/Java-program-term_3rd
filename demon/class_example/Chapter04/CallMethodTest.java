/**
Ô´³ÌÐò£ºCallMethodTest.java
*/
class Location {
	int x, y;
}
class Point {
	int x, y;
	Point() {
		x = 20;
		y = 30;
	}
	void getData(int xValue, int yValue) {
		xValue = 100;
		yValue = 200;
	}
	void getLocation(Location locRef) {
		locRef.x = x;
		locRef.y = y;
	}
}
public class CallMethodTest {
	public static void main(String[] args){
		Point p = new Point();
		System.out.println("Object p¡¯s value:");
		System.out.println("p.x = " + p.x +"  p.y = " + p.y);
		int xVal = -1, yVal = -1;
		p.getData(xVal,yVal);
		System.out.println("Pass by value:");
		System.out.println("xVal = " + xVal +"  yVal = " + yVal);
		Location loc = new Location();
		p.getLocation(loc);
		System.out.println("Pass by reference:");
		System.out.println("xVal = " + loc.x + "  yVal = " +loc.y);
	}
}
