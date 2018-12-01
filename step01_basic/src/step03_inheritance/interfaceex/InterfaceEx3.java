package step03_inheritance.interfaceex;

/* class와 interface를 이용하여 성적처리
 * 클래스명 : User
 *  -name:String
 *  +User()
 *  +User(name:String)
 *  +toString():String    --> "이름 : 홍길동" 를  리턴
 *  
 *  인터페이스명 : Score
 *  +sol:int         (초기값:20)
 *  +getScore():int
 *  
 *  인터페이스명 : Print
 *  +toPaint():String
 *  
 *  [출력화면]
 *  이름 : 홍길동
 *  점수 : 60점
 */

class User{
	private String name;

	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "이름 : " + name ;
	}
	
}

interface Score{
	public int sol = 20;
	public int getScore();
}

interface Print{
	public String toPaint();
	
}
public class InterfaceEx3 extends User implements Score, Print{ // User, Score, Print 상속받기
	int s; //맞은 개수
	
	public InterfaceEx3(String name, int s) {
		super(name);
		this.s=s;
	}

	@Override
	public String toPaint() {
		// TODO Auto-generated method stub
		return super.toString()+"\n점수 : " + getScore()+ "점";
	}
	
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return s*sol;
	}
	
	public static void main(String[] args) {
		InterfaceEx3 ob=new InterfaceEx3("홍길동", 3);
				System.out.println(ob.toPaint());
	}
}
