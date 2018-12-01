package step03_inheritance.homework.test21;

public class Salary {
	private String name;
	private int salary;
	
	public Salary() {
		super();
	}

	public Salary(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void viewInfomation() {
		System.out.println("¿Ã∏ß : "+name+"\nø¨∫¿ : "+salary);
	}
	

}
