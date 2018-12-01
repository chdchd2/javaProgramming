package step03_inheritance.interfaceex;

/* class�� interface�� �̿��Ͽ� ����ó��
 * Ŭ������ : User
 *  -name:String
 *  +User()
 *  +User(name:String)
 *  +toString():String    --> "�̸� : ȫ�浿" ��  ����
 *  
 *  �������̽��� : Score
 *  +sol:int         (�ʱⰪ:20)
 *  +getScore():int
 *  
 *  �������̽��� : Print
 *  +toPaint():String
 *  
 *  [���ȭ��]
 *  �̸� : ȫ�浿
 *  ���� : 60��
 */

class User{
	private String name;

	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "�̸� : " + name ;
	}
	
}

interface Score{
	public int sol = 20;
	public int getScore();
}

interface Print{
	public String toPaint();
	
}
public class InterfaceEx3 extends User implements Score, Print{ // User, Score, Print ��ӹޱ�
	int s; //���� ����
	
	public InterfaceEx3(String name, int s) {
		super(name);
		this.s=s;
	}

	@Override
	public String toPaint() {
		// TODO Auto-generated method stub
		return super.toString()+"\n���� : " + getScore()+ "��";
	}
	
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return s*sol;
	}
	
	public static void main(String[] args) {
		InterfaceEx3 ob=new InterfaceEx3("ȫ�浿", 3);
				System.out.println(ob.toPaint());
	}
}
