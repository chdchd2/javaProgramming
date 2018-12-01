package step02_method.overloadex;

// 메서드 오버로딩: 같은 이름의 메서드를 여러 번 구현하는것
public class OverloadEx {
	int a=10;
	int b=15;
	
	public int max() {
		return (a>b)?a:b;
	}
	public int max(int a,int b) {
		return (a>b)?a:b;
	}
	public double max(double a,double b) {
		return (a>b)?a:b;
	}
	public static void main(String[] args) {
		OverloadEx ob=new OverloadEx();
		System.out.println("큰수:"+ob.max());
		System.out.println("큰수:"+ob.max(100,70));
		System.out.println("큰수:"+ob.max(50.4,88.9));
	}
}







