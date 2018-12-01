package step02_method.constructorex;

public class ConstructorEx2 {
	public ConstructorEx2() {
		System.out.println("default constructor");
	}
	public ConstructorEx2(String str) {
		this();
		System.out.println(str + " constructor");
	}
	public ConstructorEx2(String str, int n) {
		this(str);
		System.out.println(str + "  " + n + " constructor");
		
	}
	public static void main(String[] args) {
		new ConstructorEx2("ABC", 123);
	}
}
