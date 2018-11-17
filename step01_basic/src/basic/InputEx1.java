package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 콘솔로 부터 데이타을 입력받는 방법

이름을 입력하시오 : 홍길동

나의 이름은 홍길동입니다
*/
public class InputEx1 {

	public static void main(String[] args) throws IOException {
		String name;
		int age;
		char gender;
		float tall;
		double weiget;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("이름을 입력하시오 : "); name=br.readLine();
		System.out.println("나이를 입력하시오 : "); age=Integer.parseInt(br.readLine());
		System.out.println("성별을 입력하시오 : "); gender=br.readLine().charAt(0);
		System.out.println("신장을 입력하시오 : "); tall=Float.parseFloat(br.readLine());
		System.out.println("체중을 입력하시오 : "); weiget=Double.parseDouble(br.readLine());
		
		
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("나의 나이는 " + age + "세 입니다.");
		System.out.println("나의 셩별은 " + gender + "자 입니다.");
		System.out.println("나의 신장은 " + tall + "cm 입니다.");
		System.out.println("나의 체중은 " + weiget + "kg 입니다.");
	}

}
