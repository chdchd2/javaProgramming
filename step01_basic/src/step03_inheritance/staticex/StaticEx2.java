package step03_inheritance.staticex;

public class StaticEx2 {
	public static void main(String[] args) {
		System.out.println("** 입금 당시의 금리 **");
		BankAccount ob1=new BankAccount(1994, "kim", 1000, 0.07); ob1.view();
		BankAccount ob2=new BankAccount(1998, "lee", 1000, 0.12); ob2.view();
		BankAccount ob3=new BankAccount(2005, "park", 1000, 0.05); ob3.view();
		
		System.out.println("\n** 2005년 현재의 금리 **");
		ob1.view();
		ob2.view();
		ob3.view();
		
		System.out.println("\n** 0.04로 변동한 금리 **");
//		BankAccount.rate=0.4;
		BankAccount.setRate(0.04);
		ob1.view();
		ob2.view();
		ob3.view();
	}
}
