package step04_collection.exception;

//����� ���� ����ó��

class MyException extends Exception{
	public MyException() {
		System.out.println("error!");
	}
}
public class ExceptionEx4 {
	public static void main(String[] args) throws MyException {
		int age = Integer.parseInt(args[0]);
		
		if(age < 19) {
			throw new MyException();
		} else {
			System.out.println("ȯ���մϴ�.");
		}
	}
}
