/**
Դ����ClassInstMember.java
*/
class ClassInstMember {
	static int classVar ;           //���Ա����classVar
	int instVar=2;              //ʵ����Ա����instVar
	void setData(int c, int i){    //ʵ������
		classVar = c;
		instVar = i;
	}
	ClassInstMember��int a��{
		instVar = a;
	} 
	static int getData(){          //�෽��
		//���෽���У�ֱ�ӷ��ʵĳ�Աֻ�������ԱclassVar��
		classVar = 10; 
		//���Ҫ����ʵ����Ա�������ͨ��ʵ������(�������)��
		ClassInstMember cim = new ClassInstMember(10);
		return  cim.instVar + classVar;
	}
}
