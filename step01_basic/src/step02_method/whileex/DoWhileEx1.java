package step02_method.whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		do {
			System.out.print("������ �Է��Ͻÿ�: ");
			num=Integer.parseInt(br.readLine());  //"100" --> 100
		}while(num<0 || num>100);
		
		System.out.println("����� ������ " + num +"�� �Դϴ�.");
	}
}








