/**
Ô´³ÌÐò£ºArrayRefer.java
*/
public class ArrayRefer{
	public static void main(String args[]){
			int arrayA[] = new int [5];
			System.out.println("Initial value:");
			for ( int i=0; i<arrayA.length; i++){
				System.out.println("arrayA["+ i + "] = " + arrayA[i]);
			}
			for ( int i=0; i<5; i++){
				arrayA[i] = i;
			}
			System.out.println("Refresh value:");
			for ( int i=0; i<arrayA.length; i++){
				System.out.println("arrayA["+ i + "] = " + arrayA[i]);
			}
		}
}
