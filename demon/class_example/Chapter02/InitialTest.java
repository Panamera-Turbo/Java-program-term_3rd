/**
    InitialTest.java
*/
class InitialTest {
	int varInstance;
	boolean bInst;
	void setData(int intV, boolean boolV){
		varInstance = intV;
		boolV = bInst;  //bInst���Զ���ʼ�������Բ������
		float x, y;
		y = x;    //����ʱ�����x��δ��ʼ����
	}
	public static void main(String args[]) {
		InitialTest test = new InitialTest();
		test.setData(3, false);
	}
}
