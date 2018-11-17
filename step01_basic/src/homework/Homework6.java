package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제6] 다음을 입력받아 계산하시오
(삼각형넓이 = (밑변 * 높이)/2)  

--입력--
**** 삼각형의 넓이 구하기  ****
밑변 :  10  
높이 :   3


--출력--
넓이 :   XX.XX  <--- 소수 2자리까지출력하시오*/
public class Homework6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a;
		int b;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("밑변  : ");
		a=Integer.parseInt(br.readLine());
		System.out.println("높이 : ");
		b=Integer.parseInt(br.readLine());

		double c = (a*b)/2.0;
		
		System.out.printf("넓이 : %.2f", c);
	}
}
