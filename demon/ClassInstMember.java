/**
Դ����ClassInstMember.java
*/
class ClassInstMember {
	static int classVar ;           //���Ա����classVar
	int instVar;              //ʵ����Ա����instVar
	void setData(int c, int i){    //ʵ������
		classVar = c;
		instVar = i;
	}
	static int getData(){          //�෽��
		//���෽���У�ֱ�ӷ��ʵĳ�Աֻ�������ԱclassVar��
		classVar = 10; 
		//���Ҫ����ʵ����Ա�������ͨ��ʵ������(�������)��
		ClassInstMember cim = new ClassInstMember();
		return  cim.instVar + classVar;
	}
}
