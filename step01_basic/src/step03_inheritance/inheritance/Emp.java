package step03_inheritance.inheritance;

//�⺻������, ����2�� �޴� ������, toString()�߰�

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
		return "���� �̸��� " + name + "�̰� ����ó�� " + phone + "�Դϴ�";
	}
	
	
	
	
}
