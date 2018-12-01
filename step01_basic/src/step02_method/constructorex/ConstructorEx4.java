package step02_method.constructorex;

public class ConstructorEx4 {
	public static void main(String[] args) {
		// Student 객체 ob1을 만들고 setter를 통해 데이터 대입한후 toString()으로 출력
		// 홍길동, 75,88,95
		Student ob1=new Student();
		ob1.setName("홍길동");
		ob1.setKor(75);
		ob1.setMat(88);
		ob1.setEng(95);
		System.out.println(ob1.toString());
		
		//Student 객체 ob2를 만들어 생성자를 통해 데이터를 대입한후 getter로 출력
		// 민들레, 90,85,88
		Student ob2=new Student("민들레",90,85,88);
		System.out.println("이름:" + ob2.getName());
		System.out.println("국어:" + ob2.getKor());
		System.out.println("수학:" + ob2.getMat());
		System.out.println("영어:" + ob2.getEng());
		System.out.println("총점:" + ob2.getTotal());
		System.out.printf("평균: %.2f\n" , ob2.getAvg());
		System.out.println("학점:" + ob2.getGrade());
	}
}
/*
[문제1]
홍길동의 점수는 258 이며, 평균은 86.00이고 학점은 B입니다


[문제2]
이름:민들래
국어:90
수학:75
영어:88
총점:253
평균:84.33
학점:B
*/