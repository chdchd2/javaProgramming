package step02_method.whileex;

/* Args.java(�����ڵ�) --> Args.class(�����ڵ�)
$ javac Args.java       --> ������
$ java Args

$ java  10 20 30
�� = 60
*/
public class Args {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		System.out.println("��=" + (a+b+c));
	}
}










