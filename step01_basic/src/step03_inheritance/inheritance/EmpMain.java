package step03_inheritance.inheritance;

public class EmpMain {
	public static void main(String[] args) {
		Emp ob1 = new Emp("이순신", "010-111-1111");
		System.out.println(ob1);
		
		EmpScore ob2 = new EmpScore("이순신", "010-111-1111","개발부",75.3);
		System.out.println(ob2);
	}
}
