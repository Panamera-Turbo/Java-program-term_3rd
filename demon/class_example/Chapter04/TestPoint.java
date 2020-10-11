/**
    Ô´³ÌÐò£ºTestPoint.java
*/
class Point {
	int x, y;
	String name = "A point";
	Point(){
		x = 0;
		y = 0;
		name = "";
	}
	Point(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}
	int getX(){
		return x;
	}
	int getY() {
		return y;
	}
	void move(int newX, int newY) {
		x = newX;
		y = newY;
	}
	Point newPoint(String name) {
		Point newP = new Point(-x,-y,name);
		return newP;
	}
	boolean equal(int x, int y) {
		if (this.x == x && this.y == y)
		return true;
		else
		return false;
	}
	void print(){
		System.out.println(name + " : x = " + x + "  y = " + y);
	}
}
public class TestPoint {
	public static void main(String args[]) {
		Point p = new Point();
		p.print();
		p.move(50,50);
		System.out.println(" * * after  moving * * ");
		System.out.println(" Get  x and y  directly ");
		System.out.println("   x = "+p.x+"   y = "+p.y);
		System.out.println(" or Get x and y by calling method");
		System.out.println("   x = "+p.getX()+"   y = "+p.getY());
		if (p.equal(50,50)){
			System.out.println("I like this point! ! ! !");
		}else{
			System.out.println("I hate it! ! ! !");
		}
		p.newPoint("A new point : ").print();
		new Point(10,15,"Another new point").print();
	}
}
