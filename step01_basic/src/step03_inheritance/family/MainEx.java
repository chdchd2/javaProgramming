package step03_inheritance.family;

public class MainEx {
	public static void main(String[] args) {
		Family[] ob = new Family[] {
				new Father("홍길동"),
				new Mother("홍순이"),
				new Son("홍돌이")
		};
		for(Family f:ob) {
			System.out.println(f.toString());
		}
		/*Father ob1=new Father("홍길동");
		Mother ob2=new Mother("김순희");
		Son ob3=new Son("홍돌이");
		
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		System.out.println(ob3.toString());*/
	}
}
/*  [출력 결과]
 * 
 *  이름 : 홍길동                  <--- Family의 toString()에서 작성
 *  아빠는 나가서 일을 한다    <--  Job인터페이스를 상속받아서  
 *                                           Father의  work()에서 작성 
 *  이름 : 김순희
 *  엄마는 집안일을 한다
 * 
 *  이름 : 홍돌이
 *  아들은 공부를 한다 
 */