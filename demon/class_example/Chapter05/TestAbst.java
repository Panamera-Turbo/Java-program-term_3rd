/**
Դ����TestAbst.java
*/
abstract class AbstClass {
	abstract void callMe();
	void meToo(){
		System.out.println("�ڳ�����AbstClass�е�meToo()����");
	}
}
class ClassD extends AbstClass{
	void callMe(){
		System.out.println("��ClassD�е�callMe()����");
	}
}
public class TestAbst{
	public static void main(String args[]){
		AbstClass varC = new ClassD();
		varC.callMe();
		varC.meToo();
	}
}
