package homework;
/*[문제1]
String a = "100";
String b = "200";
a 와  b의 값을 형변환해서 두수의 곱을 구하시오

--출력--
100 * 200 = 20000 */
public class Homework1 {
	public static void main(String[] args) {
		String a = "100";
		String b = "200";
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		
		System.out.println(a+"*"+b+"="+(x*y) );
	}
}
