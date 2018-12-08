package step04_collection.exception;

/*
$java ExceptionEx1 a => ���ڷ� �ٲ� �� ����
$java ExceptionEx1 0 => 0���� ���� �� ����
$java ExceptionEx1   => �Է� ���� ����
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
			System.out.println("���ڷ� �ٲ� �� ����");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է°��� ����");
		} finally {
			System.out.println("** ���� **");
		}*/
		
		//-------------------------------------------------------
		
		int val = 5;

		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(val / n);
			return;
		} catch (Exception e) {
			System.out.println("** ����  **");
		}
	}
}
