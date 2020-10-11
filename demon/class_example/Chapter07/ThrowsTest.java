/**
􂓀􃀻􁒿: ThrowsTest.java
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ThrowsTest extends Applet implements ActionListener {
	Label label1, label2;
	int[] mark = new int[50];
	int i = 0;
	TextField textfield = new TextField(20);

	public void init() {
		setLayout(new BorderLayout());
		Panel np = new Panel();
		np.setLayout(new GridLayout(1, 2));
		np.add(new Label("Please input marks: ", Label.RIGHT));
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
		Button average = new Button("Average");
		average.addActionListener(this);
		add("South", average);
		validate();
		textfield.requestFocus();
	}

	public void actionPerformed(ActionEvent ae) {
		Integer x;
		String arg = ae.getActionCommand();
		try {
			if (arg.equals("Average")) {
				label1.setText(i + "个学生的平均分为: " + calculate());
				i = 0;
				textfield.requestFocus();
			} else {
				x = new Integer(arg);
				mark[i] = x.intValue();
				exam(mark[i]);
				i++;
				textfield.setText("");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			label2.setText("程序只能输入 50 个分数!");
		} catch (ArithmeticException e) {
			label2.setText("没有输入分数!");
		} catch (NegativeMarkException e) {
			label2.setText("负分非法: " + mark[i] + " 应该在:0--100");
		} catch (OutofMarkException e) {
			label2.setText("不合法的分数: " + mark[i]
					+ " 分数应该在: 0 -- 100 之间");
		}
	}

	int calculate() {
		int aver = 0;
		for (int k = 0; k < i; k++) {
			aver += mark[k];
		}
		return aver = aver / i;
	}

	void exam(int mark) throws NegativeMarkException, OutofMarkException {
		if (mark < 0)
			throw new NegativeMarkException();
		if (mark > 100)
			throw new OutofMarkException();
	}
}

class NegativeMarkException extends Throwable {
	NegativeMarkException() {
	}
}

class OutofMarkException extends Throwable {
	OutofMarkException() {
	}
}