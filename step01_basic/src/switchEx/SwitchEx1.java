package switchEx;

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
		
		char check='e';
		if(check=='E' || check=='e' ) {
			System.out.println("Excellent");
		} else if(check=='G' || check=='g') {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
	}
}
