package step02_method.whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
[����] do-while�� �̿��ؼ� �ݺ�ó���Ͻÿ�
�ٽ��ұ��(Y/y) : Y
�ٽ��ұ��(Y/y) : y
�ٽ��ұ��(Y/y) : n

** �����ϼ̽��ϴ�**
*/
public class DoWhileEx2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char ck;
		
		do {
			System.out.print("�ٽ��ұ��(Y/y): ");
			ck=br.readLine().charAt(0);   // Y \n \r
		}while(ck=='Y' || ck=='y');
		
		System.out.println("** �����ϼ̽��ϴ�**");
	}
}












