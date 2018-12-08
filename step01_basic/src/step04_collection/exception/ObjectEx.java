package step04_collection.exception;

public class ObjectEx{
	String name="ȫ�浿";
	public void view() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		new ObjectEx().view();
	}
}


//---------------------------------------------------

/*
import java.lang.System;
import java.lang.String;

public class ObjectEx extends Object{
	String name="ȫ�浿";
	public ObjectEx() {
		super();
	}
	public void view() {
		System.out.println(this.name.toString());
	}
	public static void main(String[] args) {
		ObjectEx ob=new ObjectEx();
		ob.view();
	}
}
*/