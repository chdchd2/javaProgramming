package step02_method.methodex;

//call by name: �̸��� �ִ� �޼���
public class MethodEx1 {
	public static void view() {
		System.out.println("Hello");
		return;  //����Ǹ� ������(��������)
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
