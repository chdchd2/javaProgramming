package step02_method.objectex;

//setter&getter: 필드 하나당 하나씩 값을 대입하는 setter과 그 값을 리턴하는 getter
class Member{
	private String name;
	private int age;
	private double tall;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
}
public class ObjectEx3 {
	public static void main(String[] args) {
		Member ob=new Member();
		ob.setName("홍길동");
		ob.setAge(25);
		ob.setTall(175.3);
		
		System.out.println("이름:"+ob.getName());
		System.out.println("나이:"+ob.getAge());
		System.out.println("신장:"+ob.getTall());
	}
}














