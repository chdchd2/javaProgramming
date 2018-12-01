package step03_inheritance.staticex;

public class BankAccount {
	private int year;
	private String name;
	private int money;
	private static double rate;
	
	public BankAccount(int year, String name, int money, double r) {
		super();
		this.year = year;
		this.name = name;
		this.money = money;
		rate=r;
	}
	
	//유효성 검사
	public static void setRate(double r) {
		if(r < 0.02 || r > 0.12) {
			System.out.println("금리 확인 바람");
			System.exit(0);
		}
		rate=r;
	}
	public void view() {
		System.out.println(year+"\t"+ name+"\t"+ money+"\t"+rate);
	}
	
}
