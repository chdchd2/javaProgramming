package step03_inheritance.inheritance;

//기본생성자, 인자2개 받는 생성자, toString()추가

public class Emp {
	private String name;
	private String phone;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "나의 이름은 " + name + "이고 연락처는 " + phone + "입니다";
	}
	
	
	
	
}
