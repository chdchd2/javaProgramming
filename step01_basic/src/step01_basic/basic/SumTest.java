package step01_basic.basic;

/*  + 의 의미
 1. 더하기
 2. 연결하기
 3. 단항연산자 -(-3)=-1*-3=3 / +(-3)= +1*-3 = -3
 */
public class SumTest {

	public static void main(String[] args) {
		int a = 5, b =3 ;
		System.out.println(5+3);
		System.out.println(a+b);
		System.out.println("a+b="+a+b);
		System.out.println("a+b="+(a+b));
		System.out.println(a); // 문제 ! 5 + 3 = 8 출력
		System.out.println(a+"+"+b+"="+(a+b)); // 은총이 정답 ㅇ_ㅇ 
		
	}

}
