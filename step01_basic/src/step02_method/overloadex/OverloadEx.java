package step02_method.overloadex;

// �޼��� �����ε�: ���� �̸��� �޼��带 ���� �� �����ϴ°�
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
		System.out.println("ū��:"+ob.max());
		System.out.println("ū��:"+ob.max(100,70));
		System.out.println("ū��:"+ob.max(50.4,88.9));
	}
}







