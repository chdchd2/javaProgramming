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
	
	//��ȿ�� �˻�
	public static void setRate(double r) {
		if(r < 0.02 || r > 0.12) {
			System.out.println("�ݸ� Ȯ�� �ٶ�");
			System.exit(0);
		}
		rate=r;
	}
	public void view() {
		System.out.println(year+"\t"+ name+"\t"+ money+"\t"+rate);
	}
	
}
