package step03_inheritance.shape;

/*  Triangle는  Shape를 상속받음
* 
*  +Triangle()
*  +Triangle(data1:int , data2:int)  ==> data1,data2를 부모 생성자로 넘김
*  +getSize():double                 ==>삼각형의 넓이를 리턴(밑변 * 높이 /2) 
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







