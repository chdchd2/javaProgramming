package step02_method.methodex;

//call by value: ���� �����ϴ� �޼���
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
			return "�հ�";
		else
			return "���հ�";
	}
	public static void main(String[] args) {
		show1(10,'A',10.5, 100.3f);
		
//		int sum=show2(95,85,73); System.out.println("�հ�:"+sum);  //�հ�:253
		System.out.println("�հ�:"+show2(95,85,73)); 
		
		System.out.printf("���:%.2f\n",show3(95,85,73));                //���:86.33
		
		System.out.println("���:"+show4(95,85,73));                   //���:�հ�
		//����� 60�̻��̸� "�հ�", �̸��̸� "���հ�"		
	}
}












