package step05_network.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowEx2 extends Frame implements ActionListener{
	Button bt1,bt2,bt3,bt4,bt5;
	
	public WindowEx2(String title) {
		super(title);
		init();
		super.setBounds(150, 150, 300, 300);
		super.setVisible(true);
		super.addWindowListener(new WinHandlerEx());
	}
	public void init() {
		bt1=new Button("����");
		bt2=new Button("����");
		bt3=new Button("����");
		bt4=new Button("����");
		bt5=new Button("�߾�");
		
		super.setLayout(new BorderLayout());
		//super.setLayout(new FlowLayout());
		
		super.add(bt1, "East");
		super.add(bt2, "West");
		super.add(bt3, "South");
		super.add(bt4, "North");
		super.add(bt5, "Center");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
	}
	
	//����� ���� ��øŬ���� : WindowEx2$WinHandlerEx.class
	class WinHandlerEx extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1)
			System.out.println("���ʹ�ư�� ������");
		if(e.getSource()==bt2)
			System.out.println("���ʹ�ư�� ������");
		if(e.getSource()==bt3)
			System.out.println("���ʹ�ư�� ������");
		if(e.getSource()==bt4)
			System.out.println("���ʹ�ư�� ������");
		if(e.getSource()==bt5)
			System.out.println("�߾ӹ�ư�� ������");
	}
	
}
public class AwtEx2 {
	public static void main(String[] args) {
		new WindowEx2("���� ���� ������2");
	}
}




