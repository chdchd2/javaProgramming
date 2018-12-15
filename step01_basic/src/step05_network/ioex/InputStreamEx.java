package step05_network.ioex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.print("InputString:");
		String str=br.readLine();    // ���� ��Ʈ���� ����ϴ� �ͺ��� �ӵ��� ������.
		System.out.println(str);
		
		isr.close();
		br.close();
		//----------------------------------------------------------------------------------------
/*		
		InputStreamReader isr=new InputStreamReader(System.in);
		System.out.print("InputString:");
		char ch='\0';
		while(ch != '\n'){
			ch=(char)isr.read();   // ���ڽ�Ʈ��(InputStreamReader), �ѱ� ó�� O
			System.out.print(ch);
		}
		isr.close();
	*/	
		//----------------------------------------------------------------------------------------
/*		
		System.out.print("InputString:");
		char ch='\0';
		while(ch != '\n'){
			ch=(char)System.in.read();   // ����Ʈ��Ʈ��(InputStream), �ѱ� ó�� X
			System.out.print(ch);        // 65(A), 97(a)
		}
		*/
	}
}











