class VaraibleInit{
	int x = 10;
	int y = 20;
	VariableInit(int a, int b){
		x = a;
		y = b;
	}
}
public class VariableInitTest{
	public static void main(String[] args){
		VaraibleInit vi = new VariableInit(100,200);
		System.out.println(¡±The object vi¡¯s value is (¡±
		+ vi.x + ¡±, ¡± + vi.y + ¡±)¡±);
	}
}
