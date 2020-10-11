import java.awt.*;
public class MyFrame extends Frame{
	public static void main(String args[]){
		MyFrame fr = new MyFrame("HelloOutThere !");
		// 下面调用来自Component类的setSize( )方法
		fr.setSize(400,200);
		fr.setBackground(Color.blue);
		fr.setVisible(true);
	}
	public MyFrame (String str){
		super(str);
	}
}