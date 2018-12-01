package step01_basic.basic;

public class ParseIntEx {

	public static void main(String[] args) {
		String a = "100";
		String b = "200";
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		
		System.out.println(a+b); //100200
		System.out.println(x+y); //300
	}

}
