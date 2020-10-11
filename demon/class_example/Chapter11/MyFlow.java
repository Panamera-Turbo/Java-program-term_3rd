import java.awt.*;

public class MyFlow {
	private Frame f;
	private Button button1,button2,button3;

	public static void main(String args[]) {
		MyFlow mflow = new MyFlow( );
		mflow.go( );
	}

	public void go( ) {
		f = new Frame("Flow Layout");
		f.setLayout(new FlowLayout( ));
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.setSize(100,100);
		f.setVisible(true);
		}
}