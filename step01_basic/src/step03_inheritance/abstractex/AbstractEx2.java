package step03_inheritance.abstractex;

abstract class Shape{
	abstract public void onDraw();
	abstract public void onDelete();
}
//------------------------------------------------------
class Rectangle extends Shape{
	@Override
	public void onDraw() {
		System.out.println("�簢���� �׸���");
	}

	@Override
	public void onDelete() {
		System.out.println("�簢���� �����");
	}
}
//------------------------------------------------------
class Circle extends Shape{
	@Override
	public void onDraw() {
		System.out.println("���� �׸���");
	}

	@Override
	public void onDelete() {
		System.out.println("���� �����");
	}
}
//------------------------------------------------------
public class AbstractEx2 {
	public static void main(String[] args) {
		Shape ob=new Rectangle();
		ob.onDraw();
		ob.onDelete();
		
		ob=new Circle();
		ob.onDraw();
		ob.onDelete();
		
/*		Rectangle ob1=new Rectangle();
		ob1.onDraw();
		ob1.onDelete();
		
		Circle ob2=new Circle();
		ob2.onDraw();
		ob2.onDelete();*/
	}
}












