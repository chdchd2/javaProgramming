package step01_basic.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����5] ������ �Է¹޾� ����Ͻÿ�

--�Է�--
Input name : �ε鷡
kor : 90 
eng : 70 
mat : 75

--���--
�̸� : �ε鷡
�հ����� : 235��
������� :  78.3   <-- �Ҽ� 1�ڸ���������Ͻÿ�*/
public class Homework5 {
	public static void main(String[] args) throws IOException {
		String name;
		int kor;
		int eng;
		int mat;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("�̸� : "); name=br.readLine();
		System.out.println("��������  : "); kor=Integer.parseInt(br.readLine());
		System.out.println("�������� : "); eng=Integer.parseInt(br.readLine());
		System.out.println("�������� : "); mat=Integer.parseInt(br.readLine());
		
		int sum = kor+eng+mat;
		double avg = sum/3.0;
		
		System.out.println("�̸� : " + name);
		System.out.println("�հ����� : " + sum + "��");
		System.out.printf("������� : %.1f " ,avg);
		
	}
}
