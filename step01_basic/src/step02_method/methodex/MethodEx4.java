package step02_method.methodex;

//call by reference:주소를 전달
public class MethodEx4 {
	public static void view1(String str) {
		System.out.println(str);
	}
	public static void view2(int[] num) {
		for(int n:num) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		String str="happy";
		view1(str);
		
		int[] num= {10,20,30,40,50};
		view2(num);
	}
}
