package step01_basic.switchEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제]
숫자를 입력하시오 : 5

5는 홀수 입니다
*/
public class SwitchEx2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		System.out.println("숫자를 입력하시오 : ");
		num = Integer.parseInt(br.readLine());
		
		switch(num%2) {
		case 0: 
			System.out.println(num+"은 짝수 입니다.");
			break;
		case 1: 
			System.out.println(num+"은 홀수 입니다.");
			break;
		}
		
		
	}
}
