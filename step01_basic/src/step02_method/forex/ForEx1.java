package step02_method.forex;

public class ForEx1 {
	public static void main(String[] args) {
		//100 97 94....82------------------------
/*		for(int i=100; i>=80; i-=3) {
			System.out.print(i+"  ");
		}
		System.out.println();  //�ٹٲ�
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
		System.out.println("1-100������ ��ü��: " + sum);    // 5050
		System.out.println("1-100������ Ȧ����: " + odd);    // 2500  
		System.out.println("1-100������ ¦����: " + even);   // 2550
		
	}
}












