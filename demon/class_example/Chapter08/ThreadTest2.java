/**
   源程序： ThreadTest2.java
*/
public class ThreadTest2 {
  public ThreadTest2() {
    FirstThread first = new FirstThread();
    SecondThread second = new SecondThread();
    first.start();
    second.start();
    try {
      System.out.println("Waiting for first thread to finish");
      first.join();
      System.out.println("Waking up second thread...");
      second.resume();
    } catch (InterruptedException e) {}
  }
  public static void main(String[] args) {
     new ThreadTest2();
  }
}
class FirstThread extends Thread {
  public void run() {
    try {
       System.out.println("First thread STARTS running.");
       for(int i=0; i<6; i++) {
         System.out.println("First " + i);
         sleep(1000);
       }
       System.out.println("First thread FINISHES running.");
    } catch (InterruptedException e) {}
  }
}
class SecondThread extends Thread {
  public void run() {
    try{
     System.out.println("\tSecond thread STARTS running.");
     for(int i=0; i<6; i++) {
       if(i == 4) {
        System.out.println("\tSecond thread SUSPENDS itself.");
        suspend();
       }
       System.out.println("\tSecond " + i);
        sleep(1000);
      }
      System.out.println("\tSecond thread FINISHES running.");
    } catch (InterruptedException e) {}
  }
}
