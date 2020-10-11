/**
Ô´³ÌÐò£ºConstructionMethodTest.java
*/
class ConstructionMethod{
	int a, b, c;
	ConstructionMethod(int x, int y, int z){
		a = x;
		b = y;
		c = z;
	}
	ConstructionMethod(int x, int y){
		this(x, y, 10);
	}
	ConstructionMethod(int x){
		this(x,10);
	}
}
class DefaultMethod{
	int x, y, z;
	void setData(int a, int b, int c){
		x = a;
		y = b;
		z = c;
	}
}
public class ConstructionMethodTest {
	public static void main(String args[])  {

//	ConstructionMethod cm1 = new ConstructionMethod();
	ConstructionMethod cm2 = new ConstructionMethod(1);
	ConstructionMethod cm3 = new ConstructionMethod(1,2);
	ConstructionMethod cm4 = new ConstructionMethod(1,2,3);
	DefaultMethod dm = new DefaultMethod();
	}
}
