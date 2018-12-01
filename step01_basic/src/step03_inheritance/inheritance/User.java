package step03_inheritance.inheritance;

//디폴트 생성자, 인자2개받는생성자, 게터세터
public class User {
	private String name;
	private String phone;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
