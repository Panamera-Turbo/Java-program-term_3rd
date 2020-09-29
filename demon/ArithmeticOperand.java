/**
源程序：ArithmeticOperand.java
*/
public class ArithmeticOperand {
	public static void main(String args[]){
		int a=5+4;              //a=9
		int b=a*2;              //b=18
		int c=b/4;              //c=4
		int d=b-c;              //d=14
		int e=-d;               //e=-14
		int f=e%4;              //f=-2
		int g=3;
		int h=g++;              //h=3, g=4
		int i=++g;              //g=5, i=5
		double j=18.4;
		double k=j%4;            //k=2.4
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" c = " + c);
		System.out.println(" d = " + d);
		System.out.println(" e = " + e);
		System.out.println(" f = " + f);
		System.out.println(" g = " + g);
		System.out.println(" h = " + h);
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		System.out.println(" k = " + k);
	}
}
