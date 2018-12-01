package step02_method.whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		do {
			System.out.print("점수를 입력하시오: ");
			num=Integer.parseInt(br.readLine());  //"100" --> 100
		}while(num<0 || num>100);
		
		System.out.println("당신의 점수는 " + num +"점 입니다.");
	}
}








