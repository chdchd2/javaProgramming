package step03_inheritance.shape;

/* Rectangle는  Shape를 상속받음
* 
*  +Rectangle()
*  +Rectangle(data1:int , data2:int)   ==> data1,data2를 부모 생성자로 넘김
*  +getSize():double                   ==> 사각형의 넓이를 리턴(가로 * 세로) 
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





