package step03_inheritance.shape;

/* Rectangle��  Shape�� ��ӹ���
* 
*  +Rectangle()
*  +Rectangle(data1:int , data2:int)   ==> data1,data2�� �θ� �����ڷ� �ѱ�
*  +getSize():double                   ==> �簢���� ���̸� ����(���� * ����) 
*/
public class Rectangle extends Shape {
	public Rectangle() {
		super();
	}
	public Rectangle(int data1, int data2) {
		super(data1, data2);
	}
	@Override
	public double getSize() {
		return super.getData1()*super.getData2();
	}
}





