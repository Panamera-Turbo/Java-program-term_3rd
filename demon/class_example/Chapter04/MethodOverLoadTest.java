/**
Ô´³ÌÐò£ºMethodOverLoadTest.java
*/
class MethodOverLoad {
	void receive(int i)  {
		System.out.println("Receive one int data");
		System.out.println("i = "+i);
	}
	void receive(int x, int y) {
		System.out.println("Receive two int datas");
		System.out.println("x = " + x + "    y = " + y);
	}
	void receive(double d) {
		System.out.println("Receive one double data");
		System.out.println("d = " + d);
	}
	void receive(String s) {
		System.out.println("Receive a string");
		System.out.println("s = " + s);
	}
}
public class MethodOverLoadTest {
	public static void main(String args[])  {
		MethodOverLoad mo = new MethodOverLoad ();
		mo.receive(1);
		mo.receive(2,3);
		mo.receive(3.14159);
		mo.receive("Very interesting, isn't it?");
	}
}
