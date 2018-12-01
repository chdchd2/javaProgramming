package step03_inheritance.interfaceex;

interface Cryable{
	public void cry();
	
}
interface Flyable{
	public void fly();
}
class Eagle implements Flyable, Cryable{

	@Override
	public void fly() {
		System.out.println("�������� ���� �ٴѴ�");
		
	}
	@Override
	public void cry() {
		System.out.println("ļ��~~~ ļ��~~");
		
	}
	
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		Eagle ob = new Eagle();
		ob.fly();
		ob.cry();
	}
}

//--------------------------------------------------------
/*abstract class Cryable{
	abstract public void cry();
	
}
abstract class Flyable{
	abstract public void fly();
}
class Eagle extends Flyable{

	@Override
	public void fly() {
		System.out.println("�������� ���� �ٴѴ�");
		new CryableEx().cry();
		
	}
	
	//��øŬ����(inner class) Ŭ���� �ȿ��� �� �ٸ� Ŭ������ �����ϴ� ��
	//InterfaceEx1.java --> InterfaceEx1.class, Eagle.class, Eagle$CryableEx.class
	class CryableEx extends Cryable{
		@Override
		public void cry() {
			System.out.println("ļ��~~~ ļ��~~");
			
		}
		
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		new Eagle().fly();
	}
}
*/