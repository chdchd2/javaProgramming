package step02_method.objectex;

public class ObjectEx4 {
	public static void main(String[] args) {
		// [����1] Employee ��ü ob�� �����ϰ� setter�� �̿��ؼ� �����͸� �����ÿ�
		// ����� ob.toString()�� �̿��ؼ� �ۼ��Ͻÿ�
		Employee ob=new Employee();		
		ob.setName("�̼���");
		ob.setDept("���ߺ�");
		ob.setPay(1500000);
		ob.setScore(85.75);
		System.out.println(ob.toString());
		
		//[����2] ob.setEmployee()�� �̿��ؼ� �����͸� �����ÿ�
		//����� getter�� �̿��ؼ� �ۼ��Ͻÿ�
		ob.setEmployee("���޷�","�渮��",1200000,75.34);
		System.out.println("����̸�:" + ob.getName());
		System.out.println("�ٹ��μ�:" + ob.getDept());
		System.out.println("�޴±޿�:" + ob.getPay()+"��");
		System.out.println("�Ի�����:" + ob.getScore()+"��");	
	}
}
/*
[����1]
�̸��� �̼����̰� ���ߺο� �ٹ��ϸ� �޿��� 1500000�� �Ի缺���� 85.75�Դϴ�

[����2]
����̸� : ���޷�
�ٹ��μ� : �渮��
�޴±޿� : 1200000��
�Ի����� : 75.34��
*/
