package step01_basic.ifEx;

public class IfEx1 {
	public static void main(String[] args) {
		//if문
		/*String id="abcd";
		if(id=="abcd") {
			System.out.println(id+"님이 로그인하셨습니다.");
			System.out.println("현재 포인트는 2500점입니다.");
		}
		
		System.out.println("** 즐거운 쇼핑 되세요 **");*/
		
		//if~else문
		/*int score = 75;
		if(score>=60) {
			System.out.println("합격");
			System.out.println("당신의 점수는 "+score+"점 입니다.");
		}else {
			System.out.println("불합격");
			System.out.println("딩신의 점수는 "+score+"점 입니다.재도전해주시기 바랍니다.");
		}
		*/
		
		//if~else if문
	/*	int score=93;
		char grade;
		if(score>=90) grade = 'A';
		else if(score>=80) grade = 'B';
		else if(score>=70) grade = 'C';
		else if(score>=60) grade = 'D';
		else grade = 'F';
		
		System.out.println("나의 점수는 "+score+"점이고, "+grade+"학점 입니다.");*/
		
		int score=120;
		char grade = '\0';
		if(score>100 || score <0) {
			System.out.println("데이터오류입니다. 점수를 확인해주세요. ");
			return;
		}
		
		if(score>=90 && score<=100) grade = 'A';
		if(score>=80 && score<90) grade = 'B';
		if(score>=70 && score<80) grade = 'C';
		if(score>=60 && score<70) grade = 'D';
		if(score>=0 && score<60) grade = 'F';
		
		System.out.println("나의 점수는 "+score+"점이고, "+grade+"학점 입니다.");
	}
}
