/**
Ô´³ÌÐò£ºTestCovert.java
*/
class SuperClass {
	int x;
	void setX(){
		x = 10;
	}
}
class SubClass extends SuperClass {
	int x;
	void setX() {
		x = 100;
	}
	String getMessage(){
		return "super.x = "+super.x+"\tsub.x = "+x;
	}
}
public class TestCovert{
	public static void main(String[] args){
		SubClass sc = new SubClass();
		sc.setX();
		System.out.println(sc.getMessage());
	}
}
