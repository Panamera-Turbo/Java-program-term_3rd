public class StringTest {
	public static void main(String args[]) {
		char c[] = {'J', 'a', 'v', 'a'};
		String s1 = new String(c);
		System.out.println("s1: "+s1);

		
		String s2 = "String: " + 1 + 2 + 3 + 4 + 5;
		System.out.println("s2: "+s2);
		String s3 = 1 + 2 + 3 + 4 + 5 + "  String";
		System.out.println("s3: "+s3);
		
		char ch;
		ch = s1.charAt(1);
		System.out.println("ch: "+ch);
		
		String s = "This is a demo of the getChars method.";
		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
		
		s1 = "Hello";
		s2 = "Hello";
		s3 = "Good-bye";
		String s4 = "HELLO";
		System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
		System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
		System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equalsIgnoreCase(s4));
	
		s1 = "Hello";
		s2 = new String(s1);
		System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
	}
}
