/**
   Դ����AccessControl2.java
*/
package pack2;
import pack1.Original;
class Derived extends Original{
	void access() {
		System.out.println("** �ڲ�ͬ����������,�ɷ��ʵĳ�Ա: **");
		//    System.out.println("  Private member = "+nPrivate);
		//    System.out.println("  Default member = "+nDefault);
		System.out.println("  Protected member = "+nProtected);
		System.out.println("  Public  member = "+nPublic);
	}
}
class AnotherPackage{
	void access() {
		Original o = new Original();
		System.out.println("** �ڲ�ͬ��������,�ɷ��ʵĳ�Ա: **");
		//    System.out.println("   Private member = "+o.nPrivate);
		//    System.out.println("   Default member = "+o.nDefault);
		//    System.out.println("  Protected member = "+o.nProtected);
		System.out.println("   Public member = "+o.nPublic);
	}
}

public class AccessControl2{
	public static void main(String[] args){
		Derived d = new Derived();
		d.access();
		AnotherPackage s = new AnotherPackage();
		s.access();
	}
}
