package step01_basic.basic;

/*[����] ���� ������ ����� ������ ���� �ϼ��Ͻÿ�(println, printf�� �̿�)

�̸� : ��ȣ��
���� : 85
���� : 73
���� : 68
���� : 226��
��� : 75.33��
*/
public class Test2 {
	public static void main(String[] args) {
		String name = "��ȣ��";
		int kscore = 85;
		int escore = 73;
		int mscore = 68;
		int sum = (kscore+escore+mscore);
		double avg = sum/3.0;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kscore);
		System.out.println("���� : " + escore);
		System.out.println("���� : " + mscore);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
		System.out.printf("�̸� : %s\n" ,name);
		System.out.printf("���� : %d\n" ,kscore);
		System.out.printf("���� : %d\n" ,escore);
		System.out.printf("���� : %d\n" ,mscore);
		System.out.printf("���� : %d\n" ,sum);
		System.out.printf("��� : %f\n" ,avg);
		
	}
}
