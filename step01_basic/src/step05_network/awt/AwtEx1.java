package step05_network.awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowEx1 extends Frame implements WindowListener{
	public WindowEx1() {
		super.setTitle("���� ���� ������1");
		super.setBackground(Color.YELLOW);
		super.setBounds(200, 200, 300, 300);
		super.setVisible(true);  // ���
		
		//�߻��ϴ� �̺�Ʈ�� �ش� �޼��带 ����
		super.addWindowListener(this);
	}

	@Override
	public void paint(Graphics g) {
		g.drawString("AWT ����", 100, 100);
		super.paint(g);
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}
	@Override
	public void windowClosed(WindowEvent e) {
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
	}
	@Override
	public void windowIconified(WindowEvent e) {
	}
	@Override
	public void windowOpened(WindowEvent e) {
	}
}
public class AwtEx1{
	public static void main(String[] args) {
		new WindowEx1();
	}
}	
