package step03_inheritance.homework.test21;
/*
 [문제21] 다음 프로그램을 완성하시오
(1)클래스명 : Salary
  -name:String (이름)
  -salary:int  (연봉)
  +Salary()
  +Salary(name:String, salary:int) ==> name, salary에 대입
  +viewInfomation():void     ==> 메서드에서 이름과 연봉을 출력

(2)클래스명 : Test21 ==> Salary를 상속받음
  -department:String(부서)
  +Test21()
  +Test21(nameString, salary:int, department:String)
  +viewInfomation():void     ==> 부서 출력

(3)main()함수에서
   Test21  ob = new Test21("홍길동",85000000,"개발부"); 로 시작할것


(4)출력
이름 : 홍길동
연봉 : 85000000
부서 : 개발부
 */
public class Test21 extends Salary {
	private String department;

	public Test21() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test21(String name, int salary, String department) {
		super(name, salary);
		this.department=department;
		// TODO Auto-generated constructor stub
	}

	public void viewInfomation() {
		super.viewInfomation();
		System.out.println("부서 : " + department);
	}
	
	
	
	
}
