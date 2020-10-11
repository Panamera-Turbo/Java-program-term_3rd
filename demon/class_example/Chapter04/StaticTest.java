class StaticMember {
	static int i = 0;
	
	static int incr() { return i++; }
}
public class StaticTest {
	public static void main (String args[])	{
		StaticMember st1=new StaticMember();
		StaticMember st2=new StaticMember();
		
		System.out.println(st1.i++);
		System.out.println(st1.incr());
		System.out.println(st2.i++);
		System.out.println(st2.incr());
		System.out.println(StaticMember.i++);
		System.out.println(StaticMember.incr());
	}	
}
