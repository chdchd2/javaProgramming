package step01_basic.basic;

/*[문제] 각각 변수를 만들어 다음과 같이 완성하시오(println, printf를 이용)

이름 : 강호동
국어 : 85
영어 : 73
수학 : 68
총점 : 226점
평균 : 75.33점
*/
public class Test2 {
	public static void main(String[] args) {
		String name = "강호동";
		int kscore = 85;
		int escore = 73;
		int mscore = 68;
		int sum = (kscore+escore+mscore);
		double avg = sum/3.0;
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kscore);
		System.out.println("영어 : " + escore);
		System.out.println("수학 : " + mscore);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		System.out.printf("이름 : %s\n" ,name);
		System.out.printf("국어 : %d\n" ,kscore);
		System.out.printf("영어 : %d\n" ,escore);
		System.out.printf("수학 : %d\n" ,mscore);
		System.out.printf("총점 : %d\n" ,sum);
		System.out.printf("평균 : %f\n" ,avg);
		
	}
}
