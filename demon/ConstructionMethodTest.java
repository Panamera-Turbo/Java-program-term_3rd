/**
源程序：ConstructionMethodTest.java
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
//不合法。若一个类没有定义函数，会有一个默认构造函数（不需要参数），但如果定义了非默认构造函数，则默认构造函数自动消失
	ConstructionMethod cm2 = new ConstructionMethod(1);
	ConstructionMethod cm3 = new ConstructionMethod(1,2);
	ConstructionMethod cm4 = new ConstructionMethod(1,2,3);
	DefaultMethod dm = new DefaultMethod();
	}
}
