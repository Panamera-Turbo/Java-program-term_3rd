/**
Դ����TempConverWhile.java
*/
class TempConverWhile {
	public static void main(String args[]){
		int fahr,cels;
		System.out.println("Celsius\tFahrenheit\n"); 
		cels=0;  
		while (cels<=30) {  
			fahr=cels*9/5+32;  
			System.out.println(cels+"\t"+fahr);  
			cels += 5;  
		}
	}
}
