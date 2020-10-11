/**
Ô´³ÌÐò£ºTempConverDoWhile.java
*/
class TempConverDoWhile {
	public static void main(String args[]){
		int fahr,cels;
		System.out.println("Celsius\tFahrenheit\n"); 
		cels=0;  
		do {  
			fahr=cels*9/5+32;  
			System.out.println(cels+"\t"+fahr);  
			cels += 5;  
		} while (cels<=30);
	}
}
