package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����6] ������ �Է¹޾� ����Ͻÿ�
(�ﰢ������ = (�غ� * ����)/2)  

--�Է�--
**** �ﰢ���� ���� ���ϱ�  ****
�غ� :  10  
���� :   3


--���--
���� :   XX.XX  <--- �Ҽ� 2�ڸ���������Ͻÿ�*/
public class Homework6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a;
		int b;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("�غ�  : ");
		a=Integer.parseInt(br.readLine());
		System.out.println("���� : ");
		b=Integer.parseInt(br.readLine());

		double c = (a*b)/2.0;
		
		System.out.printf("���� : %.2f", c);
	}
}
