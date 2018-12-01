package step02_method.whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*  
[문제] 단을 입력받아 구구단을 출력하시오
단을  입력하시오 :  7
7 * 1= 7
7 * 2= 14
7 * 3= 21
    :

7 * 9 = 63
*/
public class WhileEx2 {
	public static void main(String[] args)  throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n, cnt=0;		
		
		System.out.print("단을 입력하시오: ");
		n=Integer.parseInt(br.readLine());
		
		while(cnt<9) {
			++cnt;
			System.out.println(n + " * " + cnt + " = " + (n*cnt));
		}		
	}
}













