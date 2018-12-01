package step03_inheritance.homework.test21;
/*
 [����21] ���� ���α׷��� �ϼ��Ͻÿ�
(1)Ŭ������ : Salary
  -name:String (�̸�)
  -salary:int  (����)
  +Salary()
  +Salary(name:String, salary:int) ==> name, salary�� ����
  +viewInfomation():void     ==> �޼��忡�� �̸��� ������ ���

(2)Ŭ������ : Test21 ==> Salary�� ��ӹ���
  -department:String(�μ�)
  +Test21()
  +Test21(nameString, salary:int, department:String)
  +viewInfomation():void     ==> �μ� ���

(3)main()�Լ�����
   Test21  ob = new Test21("ȫ�浿",85000000,"���ߺ�"); �� �����Ұ�


(4)���
�̸� : ȫ�浿
���� : 85000000
�μ� : ���ߺ�
 */
public class Test21 extends Salary {
	private String department;

	public Test21() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test21(String name, int salary, String department) {
		super(name, salary);
		this.department=department;
		// TODO Auto-generated constructor stub
	}

	public void viewInfomation() {
		super.viewInfomation();
		System.out.println("�μ� : " + department);
	}
	
	
	
	
}
