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
		bt1=new Button("동쪽");
		bt2=new Button("서쪽");
		bt3=new Button("남쪽");
		bt4=new Button("북쪽");
		bt5=new Button("중앙");
		
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
	
	//사용자 정의 중첩클래스 : WindowEx2$WinHandlerEx.class
	class WinHandlerEx extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1)
			System.out.println("동쪽버튼이 눌러짐");
		if(e.getSource()==bt2)
			System.out.println("서쪽버튼이 눌러짐");
		if(e.getSource()==bt3)
			System.out.println("남쪽버튼이 눌러짐");
		if(e.getSource()==bt4)
			System.out.println("북쪽버튼이 눌러짐");
		if(e.getSource()==bt5)
			System.out.println("중앙버튼이 눌러짐");
	}
	
}
public class AwtEx2 {
	public static void main(String[] args) {
		new WindowEx2("내가 만든 윈도우2");
	}
}




