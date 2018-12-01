package step02_method.methodex;

public class MethodEx2 {
	public static int view1() {
		return 10;
	}
	public static char view2() {
		return 'A';
	}
	public static float view3() {
		return 50.3f;
	}
	public static String view4() {
		return "Korea";
	}
	public static boolean view5() {
		return true;
	}
	public static double view6() {
		return 100.5;
	}
	public static void main(String[] args) {
		int a=view1();     System.out.println(a);
		char b=view2();    System.out.println(b);
		float c=view3();   System.out.println(c);
//		String d=view4();   System.out.println(d);
		System.out.println(view4());
		System.out.println(view5());
		System.out.println(view6());
	}
}












