package step02_method.methodex;

//call by name: 이름만 있는 메서드
public class MethodEx1 {
	public static void view() {
		System.out.println("Hello");
		return;  //제어권만 돌려줌(생략가능)
	}
	public static void star() {
		System.out.println("******");
	}
	public static void main(String[] args) {
		view();
		star();
		view();
		star();
	}
}
