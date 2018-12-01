package step03_inheritance.inheritance;

class SuperEx{
	public void show() {
		System.out.println("superEx method");
	}
}

class SubEx extends SuperEx{
	public void show() {
		super.show();
		System.out.println("subEx method");
	}
}

public class InheritanceEx1 {
	public static void main(String[] args) {
		new SubEx().show();		
//		SubEx ob = new SubEx();
//		ob.show();
	}
}

//--------------------------------------------------------
/*class SuperEx{
	public void show1() {
		System.out.println("show1 method");
	}
}

class SubEx extends SuperEx{
	public void show2() {
		System.out.println("show2 method");
	}
}

public class InheritanceEx1 {
	public static void main(String[] args) {
		SubEx ob = new SubEx();
		ob.show1();
		ob.show2();
	}
}*/

