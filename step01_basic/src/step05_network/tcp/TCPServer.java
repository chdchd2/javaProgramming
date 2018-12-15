package step05_network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	final static int PORT=7000;
	
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(PORT);
			System.out.println("���� �����.........");
			
			while(true)
			{
				Socket sock = ss.accept();      //��û����
				
				//��Ʈ��ũ�� ���� ���� ����Ÿ�� �о����
				InputStream is=sock.getInputStream();
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				
				//�ַܼ� ���
				PrintStream ps=new PrintStream(System.out);
				
				//���� IP���
				ps.print(sock.getInetAddress().getHostAddress());
				ps.print("���� ���ŵ� �޼��� : " + br.readLine() +"\n");
				
//				ps.close();
//				br.close();
//				sock.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
/* ����â(�ܼ�)���� ������ (��Ű�� ������)
 * 
 * D:\.........\day21_Network\src>javac -d ../bin tcp/TCPServer.java
 * D:\.........\day21_Network\src>javac -d ../bin tcp/TCPClient.java
 * 
 * 
 * D:\..........\day21_Network\bin>java tcp/TCPServer
 * D:\..........\day21_Network\bin>java tcp/TCPClient
 * 
 */


















