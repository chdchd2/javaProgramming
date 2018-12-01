package step03_inheritance.abstractex;

//추상메서드가 없어도 추상 클래스를 만들 수 있다
abstract class AA{
	public void view1(){ //--1
		
	}  
	public void view2(){
		
	}
}
class BB extends AA{
	@Override
	public void view2(){  //--3   (재정의)
		
	} 
}
public class AbstractEx1 {
	public static void main(String[] args) {
//		AA ob=new AA();    //객체생성가능, 1번호출
		
		
		AA ob2=new BB();    //3번, 2번 호출
		ob2.view1();
		ob2.view2();
	}
//추상메서드가있는 추상클래스
/*abstract class AA{
	public void view1(){ //--1
		
	}  
	abstract public void view2();
}
class BB extends AA{
	@Override
	public void view2(){  //--3   (재정의)
		
	} 
}
public class AbstractEx1 {
	public static void main(String[] args) {
//		AA ob=new AA();    //객체생성가능, 1번호출
		
		
		AA ob2=new BB();    //3번, 2번 호출
		ob2.view1();
		ob2.view2();
	}*/
//일반클래스-----------------------------------------
/*class AA{
	public void view1(){ //--1
		
	}  
	public void view2(){ //--2  
		
	}  
}
class BB extends AA{
	@Override
	public void view1(){  //--3   (재정의)
		
	} 
}
public class AbstractEx1 {
	public static void main(String[] args) {
		AA ob=new AA();    //객체생성가능, 1번호출
		ob.view1();
		
		AA ob2=new BB();    //3번, 2번 호출
		ob2.view1();
		ob2.view2();
	}*/
}