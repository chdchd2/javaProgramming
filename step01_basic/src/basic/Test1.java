package basic;

/*[����] ������ ���� �ϼ��Ͻÿ�
���� ������ ����� ���� �������� ����� ����Ͻÿ�
printf�� �̿�

-���-
���� �̸��� ��ȣ���̸� ������ �����̰� �Ի缺���� 85.35�� �Դϴ�
*/
public class Test1 {

	public static void main(String[] args) {
		String name = "��ȣ��";
		String gender = "����";
		double score = 85.35;
		
		System.out.printf("���� �̸��� %s �̸� ", name);
		System.out.printf("������ %s �̰� ", gender );
		System.out.printf("�Ի缺���� %.2f �Դϴ�", score);
	}
}