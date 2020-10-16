package xxx.yyy;

public class Hello {
   int x=10, y=100;
   int max(int a, int b) {
      return (a>b)?a:b;
   }
   public static void main(String args[])  {
      int z;
      Hello h = new Hello();
      System.out.println("h.x = "+ h.x + ",  h.y = " + h.y);
      z = h.max(h.x, h.y);
      System.out.println("Max value = "+z);
   }
}
