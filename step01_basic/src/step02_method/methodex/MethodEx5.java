package step02_method.methodex;

public class MethodEx5 {
	public static void view1() {
		System.out.println("static method");
	}
	public void view2() {
		System.out.println("non-static method");
	}
	public static void main(String[] args) {
		view1();
		
		MethodEx5 ob=new MethodEx5();
		ob.view2();
	}
}







