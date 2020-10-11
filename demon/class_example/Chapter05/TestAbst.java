/**
源程序：TestAbst.java
*/
abstract class AbstClass {
	abstract void callMe();
	void meToo(){
		System.out.println("在抽象类AbstClass中的meToo()方法");
	}
}
class ClassD extends AbstClass{
	void callMe(){
		System.out.println("在ClassD中的callMe()方法");
	}
}
public class TestAbst{
	public static void main(String args[]){
		AbstClass varC = new ClassD();
		varC.callMe();
		varC.meToo();
	}
}
