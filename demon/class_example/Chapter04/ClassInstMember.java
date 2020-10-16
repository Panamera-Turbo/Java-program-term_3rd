/**
源程序：ClassInstMember.java
*/
class ClassInstMember {
	static int classVar ;           //类成员变量classVar
	int instVar=2;              //实例成员变量instVar
	void setData(int c, int i){    //实例方法
		classVar = c;
		instVar = i;
	}
	ClassInstMember（int a）{
		instVar = a;
	} 
	static int getData(){          //类方法
		//在类方法中，直接访问的成员只能是类成员classVar。
		classVar = 10; 
		//如果要访问实例成员，则必须通过实例访问(对象访问)。
		ClassInstMember cim = new ClassInstMember(10);
		return  cim.instVar + classVar;
	}
}
