package step03_inheritance.shape;

/*  Triangle��  Shape�� ��ӹ���
* 
*  +Triangle()
*  +Triangle(data1:int , data2:int)  ==> data1,data2�� �θ� �����ڷ� �ѱ�
*  +getSize():double                 ==>�ﰢ���� ���̸� ����(�غ� * ���� /2) 
*/
public class Triangle extends Shape {
	public Triangle() {
		super();
	}
	public Triangle(int data1, int data2) {
		super(data1, data2);
	}
	@Override
	public double getSize() {
		return (double)(super.getData1()*super.getData2())/2;
	}
}







