package step02_method.forex;

public class ForEx2 {
	public static void main(String[] args) {
/*		for(int i=1; i<=10; i++) {
			if(i==5)
				continue;  // break;
			System.out.println(i);
		}*/
		//-------------------------------------------
		String[] num= {"red","green","blue"};
		
		for(String n:num) {
			System.out.println(n);
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}


















