package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* �ַܼ� ���� ����Ÿ�� �Է¹޴� ���

�̸��� �Է��Ͻÿ� : ȫ�浿

���� �̸��� ȫ�浿�Դϴ�
*/
public class InputEx1 {

	public static void main(String[] args) throws IOException {
		String name;
		int age;
		char gender;
		float tall;
		double weiget;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("�̸��� �Է��Ͻÿ� : "); name=br.readLine();
		System.out.println("���̸� �Է��Ͻÿ� : "); age=Integer.parseInt(br.readLine());
		System.out.println("������ �Է��Ͻÿ� : "); gender=br.readLine().charAt(0);
		System.out.println("������ �Է��Ͻÿ� : "); tall=Float.parseFloat(br.readLine());
		System.out.println("ü���� �Է��Ͻÿ� : "); weiget=Double.parseDouble(br.readLine());
		
		
		System.out.println("���� �̸��� " + name + "�Դϴ�.");
		System.out.println("���� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("���� �ͺ��� " + gender + "�� �Դϴ�.");
		System.out.println("���� ������ " + tall + "cm �Դϴ�.");
		System.out.println("���� ü���� " + weiget + "kg �Դϴ�.");
	}

}
