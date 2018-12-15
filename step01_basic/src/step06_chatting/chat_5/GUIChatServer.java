package step06_chatting.chat_5;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Vector;

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
	//�׽�Ʈ2----------------------------------------------------------
	Vector<ChatHandle>  inwon=null;           //�ο����� ī��Ʈ�� ����
	//�׽�Ʈ2-----------------------------------------------------------

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
		inwon=new Vector<>();    //�׽�Ʈ2         ����) �ݵ�� serverStart()���� ���� ����� ��� ��
		serverStart();	           //�׽�Ʈ1               �׷��� ������ NullPointException()�߻� 
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
				//�׽�Ʈ2---------------------------------------------------
				//����ó���� �ϱ����� Ŭ���̾�Ʈ ��ü����
				ChatHandle ch=new ChatHandle(this, sock);    // �������� ����   Vector<ChatHandle> inwon;
				inwon.add(ch);				                             //                      inwon=new Vector<>();
				ch.start();
				//�׽�Ʈ2---------------------------------------------------
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//�׽�Ʈ1-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	//�׽�Ʈ2---------------------------------------------------
	public void setMsg(String str){
		txt_list.append(str);
	}
	//�׽�Ʈ2---------------------------------------------------	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_exit)
			System.exit(0);
	}
	
	public static void main(String[] args) {
		new GUIChatServer();
	}
}
////////////////////////////////////////////////////////////////////////////////////////
class ChatHandle extends Thread{
	GUIChatServer server;
	Socket sock;
	PrintWriter pw=null;
	BufferedReader br=null;
	
	public ChatHandle(GUIChatServer server, Socket sock){
		this.server=server;
		this.sock=sock;
		
		try{
			InputStream is=sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			
			OutputStream os=sock.getOutputStream();
			pw=new PrintWriter(new OutputStreamWriter(os));
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		//�׽�Ʈ2------------------------------------------------------------
		String nickname=null;
		
		try{
			nickname=br.readLine();
			server.setMsg("[" + nickname +"]���� �����ϼ̽��ϴ�.\n");     //setMsg() �޼��带 �����
			//�׽�Ʈ3----------------------------------------------------------
			broadcast("[" + nickname +"]���� �����ϼ̽��ϴ�.");
			//�׽�Ʈ3----------------------------------------------------------
			
			//�׽�Ʈ4(��ȭ����)----------------------------------------------
			while(true){
				try{
					String txt=br.readLine();
					server.setMsg(nickname + ":" + txt +"\n"); // ������ ���
					broadcast(nickname + ":" + txt);      // Ŭ���̾�Ʈ�� ����
				}catch(SocketException e){
					return;
				}
			}
			//�׽�Ʈ4(��ȭ����)----------------------------------------------
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//�׽�Ʈ5----------------------------------------------
			synchronized (server.inwon) {
				server.inwon.remove(this);
				server.setMsg("[" + nickname +"]���� �����ϼ̽��ϴ�.\n");
				broadcast("[" + nickname +"]���� �����ϼ̽��ϴ�.\n");
			}			
			//�׽�Ʈ5----------------------------------------------
		}
		//�׽�Ʈ2------------------------------------------------------------
		super.run();
	}
	//������ ��� ����ڿ��� �޼����� ���� ��-------------------------
	public void broadcast(String str){
		synchronized (server.inwon) {      // �����ϸ� �������� ����ȭ ó��  // �׽�Ʈ5
			int s=server.inwon.size();        // ������ ��
			for(int i=0; i<s; i++){
				ChatHandle ch=(ChatHandle)server.inwon.elementAt(i);
				ch.pw.println(str);
				ch.pw.flush();
			}
		}
	}
}















