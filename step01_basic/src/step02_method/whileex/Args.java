package step02_method.whileex;

/* Args.java(원시코드) --> Args.class(목적코드)
$ javac Args.java       --> 컴파일
$ java Args

$ java  10 20 30
합 = 60
*/
public class Args {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		System.out.println("합=" + (a+b+c));
	}
}










