package step02_method.objectex;

/*  -(private) , +(public) , #(protected)
 *  
 *  클래스명 : Person
 *  +name:String              
 *  +age:int
 *  +score:float
 *  
 *  +setPerson(na:String, a:int, s:float):void
 *  +viewPerson():void 
 */
// ObjectEx1.java  ----> ObjectEx1.class    Person.class
class Person{
	public String name;                                        //멤버변수(field)
	public int age;
	public float score;
	
	public void setPerson(String name, int age, float score) {  //멤버함수(method)
		this.name=name;
		this.age=age;
		this.score=score;
	}
	public void viewPerson() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("점수:"+score);
	}
}
public class ObjectEx1 {
	public static void main(String[] args) {
		Person ob1=new Person();             // new Person():실제로 heap영역에 할당되는 instance
		ob1.setPerson("kim", 20, 75.3f);     // 객체(Object): field + method
		ob1.viewPerson();
		
		Person ob2=new Person();
		ob2.setPerson("lee", 25, 55.3f);
		ob2.viewPerson();
	}
}

















