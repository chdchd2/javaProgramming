package step02_method.objectex;

/*  -(private) , +(public) , #(protected)
 *  
 *  Ŭ������ : Person
 *  +name:String              
 *  +age:int
 *  +score:float
 *  
 *  +setPerson(na:String, a:int, s:float):void
 *  +viewPerson():void 
 */
// ObjectEx1.java  ----> ObjectEx1.class    Person.class
class Person{
	public String name;                                        //�������(field)
	public int age;
	public float score;
	
	public void setPerson(String name, int age, float score) {  //����Լ�(method)
		this.name=name;
		this.age=age;
		this.score=score;
	}
	public void viewPerson() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("����:"+score);
	}
}
public class ObjectEx1 {
	public static void main(String[] args) {
		Person ob1=new Person();             // new Person():������ heap������ �Ҵ�Ǵ� instance
		ob1.setPerson("kim", 20, 75.3f);     // ��ü(Object): field + method
		ob1.viewPerson();
		
		Person ob2=new Person();
		ob2.setPerson("lee", 25, 55.3f);
		ob2.viewPerson();
	}
}

















