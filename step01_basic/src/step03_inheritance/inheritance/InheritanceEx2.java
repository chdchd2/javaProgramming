package step03_inheritance.inheritance;


//생성자 연습

class ParentEx{
	public ParentEx() {
		System.out.println("parent class");
	}
}

class ChildEx extends ParentEx{
	public ChildEx() {
		super();//생략가능
		System.out.println("child class");
		
	}
	
}
public class InheritanceEx2 {
	public static void main(String[] args) {
		new ChildEx();
	}
}
