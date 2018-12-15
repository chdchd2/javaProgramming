package step05_network.network;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		InetAddress ob1=InetAddress.getByName("www.daum.co.kr");
		InetAddress ob2=InetAddress.getLocalHost();
		URL url=new URL("http://127.0.0.1:9000/apex");
				
		System.out.println("IP:"+ob1.getHostAddress());
		System.out.println("Domain:"+ob1.getHostName());
		
		System.out.println("IP:"+ob2.getHostAddress());
		System.out.println("Domain:"+ob2.getHostName());
		
		System.out.println("prototol : " + url.getProtocol());
		System.out.println("port : " + url.getPort());
	}
}









