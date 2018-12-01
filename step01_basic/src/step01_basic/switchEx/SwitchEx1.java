package step01_basic.switchEx;

public class SwitchEx1 {
	public static void main(String[] args) {
		/*char check = 'e';
		switch (check) {
						case 'E':
						case 'e':
							System.out.println("Excellent");
							break;
						case 'G':
						case 'g':
							System.out.println("Good");
							break;
						default:
							System.out.println("Bad");
							break;
		}*/
		
		//------------------------------------------------------
		
		/*char check='e';
		if(check=='E' || check=='e' ) 
			System.out.println("Excellent");
		else if(check=='G' || check=='g') 
			System.out.println("Good");
		else 
			System.out.println("Bad");*/
		
		//------------------------------------------------------
		
		/*String position="Manager";
		
		switch(position) {
		case "CEO" : 
			System.out.println("Salary $20000");
			break;
		case "Manager" :
			System.out.println("Salary $15000");
			break;
		case "Employee":
			System.out.println("Salary $10000");
			break;
			
		}*/
		
		int score=93;
		char grade;
		
		switch(score/10) {
		case 10:
		case 9:	
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade ='C';
			break;
		case 6:
			grade ='D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("나의 점수는 "+score+"점이고, "+grade+"학점 입니다.");
		
	}
}
