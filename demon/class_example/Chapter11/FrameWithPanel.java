import java.awt.*;
public class FrameWithPanel extends Frame {

	//���캯��
	public FrameWithPanel (String str) {
	super(str);
	}

public static void main(String args[]) {
	FrameWithPanel fr = new FrameWithPanel("Frame with Panel");
	Panel pan = new Panel( );

	fr.setSize(300,200);
	fr.setBackground(Color.blue);
	fr.setLayout(null);
	pan.setSize(100,100);
	pan.setBackground(Color.yellow);

	fr.add(pan);
	fr.setVisible(true);
	}
}