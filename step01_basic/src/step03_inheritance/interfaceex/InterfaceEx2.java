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
		System.out.println("독수리는 날아 다닌다");
		
	}
	@Override
	public void cry() {
		System.out.println("캬악~~~ 캬악~~");
		
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
		System.out.println("독수리는 날아 다닌다");
		new CryableEx().cry();
		
	}
	
	//중첩클래스(inner class) 클래스 안에서 또 다른 클래스를 정의하는 것
	//InterfaceEx1.java --> InterfaceEx1.class, Eagle.class, Eagle$CryableEx.class
	class CryableEx extends Cryable{
		@Override
		public void cry() {
			System.out.println("캬악~~~ 캬악~~");
			
		}
		
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		new Eagle().fly();
	}
}
*/