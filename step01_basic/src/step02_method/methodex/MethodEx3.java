package step02_method.methodex;

//call by value: 값을 전달하는 메서드
public class MethodEx3 {
	public static void show1(int a,char b,double c,float d) {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	public static int show2(int a,int b, int c) {
		return a+b+c;
	}
	public static double show3(int a,int b, int c) {
		return (double)(a+b+c)/3;
	}
	public static String show4(int a,int b, int c) {
		double av=(double)(a+b+c)/3;
		if(av>=60)
			return "합격";
		else
			return "불합격";
	}
	public static void main(String[] args) {
		show1(10,'A',10.5, 100.3f);
		
//		int sum=show2(95,85,73); System.out.println("합계:"+sum);  //합계:253
		System.out.println("합계:"+show2(95,85,73)); 
		
		System.out.printf("평균:%.2f\n",show3(95,85,73));                //평균:86.33
		
		System.out.println("결과:"+show4(95,85,73));                   //결과:합격
		//평균이 60이상이면 "합격", 미만이면 "불합격"		
	}
}












