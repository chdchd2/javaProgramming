package step05_network.udp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) {
		final int PORT=8000;
		final int BUFFER=50;
		
		String message="";
		PrintStream ps=new PrintStream(System.out);
		
		try{
			DatagramSocket ds=new DatagramSocket(PORT);   //UDP소켓생성
			ps.print("접속 대기중.....");
			
			while(true)
			{
				byte[] buf=new byte[BUFFER];
				DatagramPacket dp=new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				
				message=new String(dp.getData());
				ps.print("\n들어온 메세지 : " + message);
				ps.flush();
				message="";
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			ps.close();
		}
	}
}








