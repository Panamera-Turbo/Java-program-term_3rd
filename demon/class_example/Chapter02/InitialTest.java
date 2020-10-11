/**
    InitialTest.java
*/
class InitialTest {
	int varInstance;
	boolean bInst;
	void setData(int intV, boolean boolV){
		varInstance = intV;
		boolV = bInst;  //bInst能自动初始化，所以不会出错。
		float x, y;
		y = x;    //编译时会出错：x尚未初始化。
	}
}
