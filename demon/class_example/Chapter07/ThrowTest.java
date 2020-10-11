/**
􂓀􃀻􁒿: ThrowTest.java
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ThrowTest extends Applet implements ActionListener {
	Label label1, label2;
	int[] mark = new int[50];
	int i = 0;
	TextField textfield = new TextField(20);

	public void init() {
		setLayout(new BorderLayout());
		Panel np = new Panel();
		np.setLayout(new GridLayout(1, 2));
		np.add(new Label("请输入分数: ", Label.RIGHT));
		np.add(textfield);
		textfield.addActionListener(this);
		add("North", np);
		Panel cp = new Panel();
		cp.setLayout(new GridLayout(2, 1));
		label1 = new Label(" ", Label.CENTER);
		label2 = new Label("Exception Message: No", Label.CENTER);
		label1.setFont(new Font("TimesRoman", Font.BOLD, 20));
		label2.setFont(new Font("Courier", Font.PLAIN, 14));
		cp.add(label1);
		cp.add(label2);
		add("Center", cp);
		Button average = new Button("平均分");
		average.addActionListener(this);
		add("South", average);
		validate();
		textfield.requestFocus();
	}

	public void actionPerformed(ActionEvent ae) {
		int aver = 0;
		Integer x;
		String arg = ae.getActionCommand();
		try {
			if (arg.equals("平均分")) {
				for (int k = 0; k < i; k++) {
					aver += mark[k];
				}
				aver = aver / i;
				label1.setText(i + "个学生的平均分数: " + aver);
				i = 0;
				textfield.requestFocus();
			} else {
				x = new Integer(arg);
				mark[i] = x.intValue();
				if (mark[i] > 100 || mark[i] < 0)
					throw new IllegelMarkException();
				i++;
				textfield.setText("");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			label2.setText("程序只能输入 50 个分数!");
		} catch (ArithmeticException e) {
			label2.setText("没有输入分数!");
		} catch (IllegelMarkException e) {
			label2.setText("不合法的分数: " + mark[i] + " 分数应该在: 0 -- 100 之间");
		}
	}
}

class IllegelMarkException extends Throwable {
	IllegelMarkException() {
	}
}