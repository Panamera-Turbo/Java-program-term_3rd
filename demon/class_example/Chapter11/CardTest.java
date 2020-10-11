import java.awt.*;
import java.awt.event.*;

public class CardTest extends MouseAdapter {
	Panel p1,p2,p3,p4,p5;
	Label l1,l2,l3,l4,l5;
	// 声明一个CardLayout 对象
	CardLayout myCard;
	Frame f;

	public static void main (String args[]) {
		CardTest ct = new CardTest( );
		ct.init( );
	}

	public void init( ) {
		f = new Frame ("Card Test");
		myCard = new CardLayout( );
		f.setLayout(myCard);

		p1 = new Panel( );
		p2 = new Panel( );
		p3 = new Panel( );
		p4 = new Panel( );
		p5 = new Panel( );

		// 为每个Panel创建一个标签并设定不同的
		// 背景颜色，以便于区分
		l1 = new Label("This is the first Panel");
		p1.add(l1);
		p1.setBackground(Color.yellow);

		l2 = new Label("This is the second Panel");
		p2.add(l2);
		p2.setBackground(Color.green);

		l3 = new Label("This is the third Panel");
		p3.add(l3);
		p3.setBackground(Color.magenta);

		l4 = new Label("This is the fourth Panel");
		p4.add(l4);
		p4.setBackground(Color.white);

		l5 = new Label("This is the fifth Panel");
		p5.add(l5);
		p5.setBackground(Color.cyan);

		//  设定鼠标事件的监听程序
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);
		p5.addMouseListener(this);
		// 将每个Panel作为一张卡片加入f
		f.add(p1,"First");
		f.add(p2,"Second");
		f.add(p3,"Third");
		f.add(p4,"Fourth");
		f.add(p5,"Fifth");

		// 显示第一张卡片
		myCard.show(f,"First");
		f.setSize(300,200);
		f.show( );
	}
		//  处理鼠标事件，每当单击鼠标键时，
		//  即显示下一张卡片。如果已经显示
		//  到最后一张，则重新显示第一张。
	public void mouseClicked(MouseEvent e) {
		myCard.next(f);
	}
}