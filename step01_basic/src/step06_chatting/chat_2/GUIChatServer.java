package step06_chatting.chat_2;
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
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class GUIChatServer extends JFrame implements ActionListener{
	TextArea txt_list;
	JButton btn_exit;
	JScrollPane scroll;
	
	//테스트 1----------------------------------------------------------------------------------------------------------------------------------------------------
	ServerSocket ss = null;
	//테스트1----------------------------------------------------------------------------------------------------------------------------------------------------
	//테스트2----------------------------------------------------------
	Vector<ChatHandle>  inwon=null;           //인원수를 카운트할 변수
	//테스트2-----------------------------------------------------------

	public GUIChatServer()
	{
		super("Chatting Server");
		
		txt_list = new TextArea();
		btn_exit = new JButton("서버종료");
		scroll = new JScrollPane(txt_list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(scroll, "Center");
		add(btn_exit,"South");
		setSize(250,250);
		setVisible(true);
		//이벤트처리-----------------------
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn_exit.addActionListener(this);
		//----------------------------------
		inwon=new Vector<>();    //테스트2         주의) 반드시 serverStart()보다 먼저 기술해 줘야 함
		serverStart();	           //테스트1               그렇지 않으면 NullPointException()발생 
	}
	
	//테스트1(준비단계)----------------------------------------------------------------------------------------------------------------------------------------------
	public void serverStart() {
		final int PORT=7500;
		try {
			ss=new ServerSocket(PORT);
			
			while(true) {
				Socket sock = ss.accept();
				String str=sock.getInetAddress().getHostAddress();
				txt_list.append(str);
				//테스트2---------------------------------------------------
				//병행처리를 하기위한 클라이언트 객체생성
				ChatHandle ch=new ChatHandle(this, sock);    // 전역변수 수정   Vector<ChatHandle> inwon;
				inwon.add(ch);				                             //                      inwon=new Vector<>();
				ch.start();
				//테스트2---------------------------------------------------
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//테스트1-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	//테스트2---------------------------------------------------
	public void setMsg(String str){
		txt_list.append(str);
	}
	//테스트2---------------------------------------------------	
	
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
		//테스트2------------------------------------------------------------
		String nickname=null;
		
		try{
			nickname=br.readLine();
			server.setMsg("[" + nickname +"]님이 입장하셨습니다.\n");     //setMsg() 메서드를 만들것
			
		}catch(IOException e){
			e.printStackTrace();
		}
		//테스트2------------------------------------------------------------
		super.run();
	}
}















