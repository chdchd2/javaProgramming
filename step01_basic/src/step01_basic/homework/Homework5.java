package step01_basic.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제5] 다음을 입력받아 계산하시오

--입력--
Input name : 민들래
kor : 90 
eng : 70 
mat : 75

--출력--
이름 : 민들래
합계점수 : 235점
평균점수 :  78.3   <-- 소수 1자리까지출력하시오*/
public class Homework5 {
	public static void main(String[] args) throws IOException {
		String name;
		int kor;
		int eng;
		int mat;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("이름 : "); name=br.readLine();
		System.out.println("국어점수  : "); kor=Integer.parseInt(br.readLine());
		System.out.println("영어점수 : "); eng=Integer.parseInt(br.readLine());
		System.out.println("수학점수 : "); mat=Integer.parseInt(br.readLine());
		
		int sum = kor+eng+mat;
		double avg = sum/3.0;
		
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + sum + "점");
		System.out.printf("평균점수 : %.1f " ,avg);
		
	}
}
