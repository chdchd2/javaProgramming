package step06_chatting.chat_2;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIChatClient extends JFrame implements ActionListener, Runnable{
	JPanel cardPane, connectPane, chatPane;
	JLabel  msg;
	JButton btn_connect, btn_send, btn_exit;
	JTextField txt_server_ip, txt_name, txt_input;
	JTextArea txt_list;
	CardLayout card;
	JScrollPane scroll;
	
	//테스트1----------------------------------------------------------------
	String ip_txt;						//ip를 저장할 변수
	Socket sock;
	final int PORT=7500;
	PrintWriter pw=null;
	BufferedReader br=null;
	//테스트1-----------------------------------------------------------------
	//테스트2-----------------------------------------------------------------
	OutputStream os=null;
	//테스트2-----------------------------------------------------------------
	
	public GUIChatClient()
	{
		super("Chatting Client(ver 1.0)");
		
		ConnectPane();
		ChatPane();
		
		//card-----------------------------
		cardPane = new JPanel();
		card = new CardLayout();
		cardPane.setLayout(card);
		cardPane.add(connectPane,"접속창");
		cardPane.add(chatPane,"채팅창");
		card.show(cardPane, "접속창");
		//----------------------------------
		add(cardPane);
		setSize(400,300);
		setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//이벤트처리-----------------------
		btn_connect.addActionListener(this);
		btn_exit.addActionListener(this);
		//----------------------------------
	}
	public void ConnectPane()
	{
		connectPane = new JPanel();
		JPanel pn=new JPanel();
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		
		msg = new JLabel("IP와 대화명을 입력하시오");
		msg.setFont(new Font("굴림체", Font.BOLD, 15));
		msg.setForeground(Color.magenta);
		
		JLabel lb1 = new JLabel("서버 I P : ");
		txt_server_ip = new JTextField("localhost", 15);
		pn1.add(lb1);    pn1.add(txt_server_ip);
		
		JLabel lb2 = new JLabel("대 화 명 : ");
		txt_name = new JTextField("캔디",15);		
		pn2.add(lb2);    pn2.add(txt_name);
		
		pn.add(pn1);     pn.add(pn2);    pn.add(msg);
		
		btn_connect = new JButton("Connection");
		
		connectPane.setBorder(BorderFactory.createTitledBorder("다중채팅화면"));
		connectPane.setLayout(new BorderLayout());
		connectPane.add(pn,"Center");
		connectPane.add(btn_connect,"South");
	}
	public void ChatPane()
	{
		chatPane = new JPanel();
		JPanel  pn = new JPanel();
		txt_list = new JTextArea();
		txt_input = new JTextField("",20);
		btn_send = new JButton("전송");
		btn_exit = new JButton("종료");
		
		scroll = new JScrollPane(txt_list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		pn.setBorder(BorderFactory.createTitledBorder("☆대화하기☆"));
		chatPane.setBorder(BorderFactory.createTitledBorder("♣채팅내용♣"));
		pn.add(txt_input);   pn.add(btn_send);  pn.add(btn_exit);
		
		chatPane.setLayout(new BorderLayout());
		chatPane.add(scroll, "Center");
		chatPane.add(pn, "South");
	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == btn_connect) {
			card.show(cardPane, "채팅창");
			//테스트1------------------------------------------------------------------------------------------------------------------------------------------------
			ip_txt=txt_server_ip.getText();
			Thread th=new Thread(this);				// implements Runnable추가 
			th.start();
			
			//테스트1------------------------------------------------------------------------------------------------------------------------------------------------
		}
		if(ob ==btn_exit)
			System.exit(0);
	}

	@Override
	public void run() {
		//테스트1------------------------------------------------------------------------------------------------------------------------------------------------
		try {
			sock=new Socket(ip_txt, PORT);				//접속시도
			
			//테스트2-----------------------------------------------------------------
			String nickname=txt_name.getText();
			os=sock.getOutputStream();
			pw=new PrintWriter(new OutputStreamWriter(os));
			pw.println(nickname);                // 주의) pw.print();  ---X
			pw.flush();
			//테스트2-----------------------------------------------------------------
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//테스트1------------------------------------------------------------------------------------------------------------------------------------------------
	}	
	
	public static void main(String[] args) {
		new GUIChatClient();
	}
}








