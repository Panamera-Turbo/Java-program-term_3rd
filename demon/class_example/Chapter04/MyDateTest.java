/**
   Ô´³ÌÐò£ºMyDateTest.java
*/
class MyDate {
	int year;
	int month;
	int day;
}
public class MyDateTest{
	public static void main(String[] args){
		MyDate date = new MyDate();
		date.year = 2008;
		date.month = 8;
		date.day = 8;
		System.out.println(¡±The day is ¡± + date.year 
					  + ¡±-¡±+ date.month + ¡±-¡±+ date.day);
	}
}
