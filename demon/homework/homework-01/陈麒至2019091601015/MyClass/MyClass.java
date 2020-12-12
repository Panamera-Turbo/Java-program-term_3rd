package MyClass;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){
    	//
    	while(true) {
//    		System.out.print("""
//				type in digit to decide which comsumer
//				is to be active，with 0 for flat comsumer
//				，1 for 3D comsumer, and other choice to exit this system
//			""");//attetion: JDK15 only

    		@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
    		int i = scanner.nextInt();

    		if(i == 0) {
    	        flatThread flatThread = new flatThread("flat comsumer: active");
    	        flatThread.start();//平面产品线程
    	        continue;
    		}
    		if(i == 1) {
    	        three_dThread three_dThread = new three_dThread("three_d(3D) cosumer: active");
    	        three_dThread.start();//三维产品线程
    	        continue;
    		}
    		else{
    			System.out.println("exit");
    			break;
    		}
    	}
    }
}