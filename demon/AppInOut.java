/**
   Դ����AppInOut.java 
*/
import java.awt.*;
import java.awt.event.*;

/**
   Դ����AppInOut.java 
*/
public class AppInOut{
   public static void main(String args[]){
      new FrameInOut();
   }
}
/**
   Դ����FrameInOut.java 
*/
class FrameInOut extends Frame implements ActionListener{
   Label prompt;
   TextField input,output;
   Button btn;
   
   FrameInOut(){
      super("ͼ���û������Java Appliction����");
      prompt=new Label("�������������֣�");//������ǩ
      input=new TextField(6); //�����ı���
      output=new TextField(20); //�����ı���
      btn=new Button("�ر�");//������ť
      setLayout(new FlowLayout());//�����ϵ�ͼ�ζ���Ĳ��ֲ���
      add(prompt);
      add(input);
      add(output);
      add(btn);
     input.addActionListener(this); //���¼�������ע��
      btn.addActionListener(this); //���¼�������ע��
      setSize(300,200);
      show();
   }

   public void actionPerformed(ActionEvent e){
      if(e.getSource()==input) //�ж��¼�Դ
         output.setText(input.getText()+",��ӭ����Java����!");
      else{
         dispose();
         System.exit(0);
      }
   }
}
