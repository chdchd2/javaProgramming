package step04_collection.exception;

/*
$java ExceptionEx1 a => 숫자로 바꿀 수 없음
$java ExceptionEx1 0 => 0으로 나눌 수 없음
$java ExceptionEx1   => 입력 값이 없음
$java ExceptionEx1 2 => 2
 
*/
public class ExceptionEx1 {
	public static void main(String[] args) {
	/*	int val = 5;

		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(val / n);
			return;
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없음");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값이 없음");
		} finally {
			System.out.println("** 종료 **");
		}*/
		
		//-------------------------------------------------------
		
		int val = 5;

		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(val / n);
			return;
		} catch (Exception e) {
			System.out.println("** 예외  **");
		}
	}
}
