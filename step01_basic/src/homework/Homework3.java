package homework;
/*[문제3] 급여명세서를 작성하시오
조건1) 기본급이 1,500,000원,수당이 55,000원,세금은 기본급의 10%
조건2) 실수령액 = 기본급 + 시간수당 - 세금

--출력--     
실수령액 : 1405000원*/
public class Homework3 {
	public static void main(String[] args) {
		int salary = 1500000;
		int pay = 55000;
		int tax = 1500000/10;
		int result = salary+pay-tax;
		
		System.out.println("실수령액 : "+result);
	}
}
