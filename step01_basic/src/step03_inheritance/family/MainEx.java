package step03_inheritance.family;

public class MainEx {
	public static void main(String[] args) {
		Family[] ob = new Family[] {
				new Father("ȫ�浿"),
				new Mother("ȫ����"),
				new Son("ȫ����")
		};
		for(Family f:ob) {
			System.out.println(f.toString());
		}
		/*Father ob1=new Father("ȫ�浿");
		Mother ob2=new Mother("�����");
		Son ob3=new Son("ȫ����");
		
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		System.out.println(ob3.toString());*/
	}
}
/*  [��� ���]
 * 
 *  �̸� : ȫ�浿                  <--- Family�� toString()���� �ۼ�
 *  �ƺ��� ������ ���� �Ѵ�    <--  Job�������̽��� ��ӹ޾Ƽ�  
 *                                           Father��  work()���� �ۼ� 
 *  �̸� : �����
 *  ������ �������� �Ѵ�
 * 
 *  �̸� : ȫ����
 *  �Ƶ��� ���θ� �Ѵ� 
 */