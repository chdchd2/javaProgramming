package step04_collection.exception;

//사용자 정의 예외처리

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
			System.out.println("환영합니다.");
		}
	}
}
