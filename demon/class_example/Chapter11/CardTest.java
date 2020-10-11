import java.awt.*;
import java.awt.event.*;

public class CardTest extends MouseAdapter {
	Panel p1,p2,p3,p4,p5;
	Label l1,l2,l3,l4,l5;
	// ����һ��CardLayout ����
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

		// Ϊÿ��Panel����һ����ǩ���趨��ͬ��
		// ������ɫ���Ա�������
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

		//  �趨����¼��ļ�������
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);
		p5.addMouseListener(this);
		// ��ÿ��Panel��Ϊһ�ſ�Ƭ����f
		f.add(p1,"First");
		f.add(p2,"Second");
		f.add(p3,"Third");
		f.add(p4,"Fourth");
		f.add(p5,"Fifth");

		// ��ʾ��һ�ſ�Ƭ
		myCard.show(f,"First");
		f.setSize(300,200);
		f.show( );
	}
		//  ��������¼���ÿ����������ʱ��
		//  ����ʾ��һ�ſ�Ƭ������Ѿ���ʾ
		//  �����һ�ţ���������ʾ��һ�š�
	public void mouseClicked(MouseEvent e) {
		myCard.next(f);
	}
}