package step06_chatting.chat_1;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class GUIChatServer extends JFrame implements ActionListener{
	TextArea txt_list;
	JButton btn_exit;
	JScrollPane scroll;
	
	//�׽�Ʈ 1----------------------------------------------------------------------------------------------------------------------------------------------------
	ServerSocket ss = null;
	
	//�׽�Ʈ1----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public GUIChatServer()
	{
		super("Chatting Server");
		
		txt_list = new TextArea();
		btn_exit = new JButton("��������");
		scroll = new JScrollPane(txt_list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scroll, "Center");
		add(btn_exit,"South");
		setSize(250,250);
		setVisible(true);
		//�̺�Ʈó��-----------------------
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn_exit.addActionListener(this);
		//----------------------------------
		
		serverStart();	//�׽�Ʈ1
	}
	
	//�׽�Ʈ1(�غ�ܰ�)----------------------------------------------------------------------------------------------------------------------------------------------
	public void serverStart() {
		final int PORT=7500;
		try {
			ss=new ServerSocket(PORT);
			
			while(true) {
				Socket sock = ss.accept();
				String str=sock.getInetAddress().getHostAddress();
				txt_list.append(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//�׽�Ʈ1-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_exit)
			System.exit(0);
	}
	
	public static void main(String[] args) {
		new GUIChatServer();
	}
}
