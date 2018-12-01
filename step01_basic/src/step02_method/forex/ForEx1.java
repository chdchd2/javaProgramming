package step02_method.forex;

public class ForEx1 {
	public static void main(String[] args) {
		//100 97 94....82------------------------
/*		for(int i=100; i>=80; i-=3) {
			System.out.print(i+"  ");
		}
		System.out.println();  //줄바꿈
*/		
		//----------------------------------------
		int sum=0, odd=0, even=0;
		for(int i=1; i<=100; i++) {
			sum += i;               // 1+2+3....100
			switch(i % 2) {
				case 0: even += i; 	break;  // 2+4+6...100 
				case 1: odd += i; 	break;  // 1+3+5...99
			}
		}
		System.out.println("1-100까지의 전체합: " + sum);    // 5050
		System.out.println("1-100까지의 홀수합: " + odd);    // 2500  
		System.out.println("1-100까지의 짝수합: " + even);   // 2550
		
	}
}












