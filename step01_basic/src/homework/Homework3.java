package homework;
/*[����3] �޿������� �ۼ��Ͻÿ�
����1) �⺻���� 1,500,000��,������ 55,000��,������ �⺻���� 10%
����2) �Ǽ��ɾ� = �⺻�� + �ð����� - ����

--���--     
�Ǽ��ɾ� : 1405000��*/
public class Homework3 {
	public static void main(String[] args) {
		int salary = 1500000;
		int pay = 55000;
		int tax = 1500000/10;
		int result = salary+pay-tax;
		
		System.out.println("�Ǽ��ɾ� : "+result);
	}
}
