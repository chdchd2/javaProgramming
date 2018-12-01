package step02_method.whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
[문제] do-while을 이용해서 반복처리하시오
다시할까요(Y/y) : Y
다시할까요(Y/y) : y
다시할까요(Y/y) : n

** 수고하셨습니다**
*/
public class DoWhileEx2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char ck;
		
		do {
			System.out.print("다시할까요(Y/y): ");
			ck=br.readLine().charAt(0);   // Y \n \r
		}while(ck=='Y' || ck=='y');
		
		System.out.println("** 수고하셨습니다**");
	}
}












