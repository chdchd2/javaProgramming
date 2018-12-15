package step05_network.ioex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.print("InputString:");
		String str=br.readLine();    // 문자 스트림을 사용하는 것보다 속도가 빠르다.
		System.out.println(str);
		
		isr.close();
		br.close();
		//----------------------------------------------------------------------------------------
/*		
		InputStreamReader isr=new InputStreamReader(System.in);
		System.out.print("InputString:");
		char ch='\0';
		while(ch != '\n'){
			ch=(char)isr.read();   // 문자스트림(InputStreamReader), 한글 처리 O
			System.out.print(ch);
		}
		isr.close();
	*/	
		//----------------------------------------------------------------------------------------
/*		
		System.out.print("InputString:");
		char ch='\0';
		while(ch != '\n'){
			ch=(char)System.in.read();   // 바이트스트림(InputStream), 한글 처리 X
			System.out.print(ch);        // 65(A), 97(a)
		}
		*/
	}
}











