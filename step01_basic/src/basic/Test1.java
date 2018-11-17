package basic;

/*[문제] 다음과 같이 완성하시오
각각 변수를 만들어 값을 대입한후 결과를 출력하시오
printf를 이용

-출력-
나의 이름은 강호동이며 성별은 남자이고 입사성적은 85.35점 입니다
*/
public class Test1 {

	public static void main(String[] args) {
		String name = "강호동";
		String gender = "남자";
		double score = 85.35;
		
		System.out.printf("나의 이름은 %s 이며 ", name);
		System.out.printf("성별은 %s 이고 ", gender );
		System.out.printf("입사성적은 %.2f 입니다", score);
	}
}