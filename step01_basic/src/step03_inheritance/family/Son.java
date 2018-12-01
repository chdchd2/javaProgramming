package step03_inheritance.family;

public class Son extends Family implements Job{
	
	
	public Son() {
		super();
	}

	
	public Son(String name) {
		super(name);
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "아들은 공부를 한다\n";
	}

	@Override
	public String toString() {
		return super.toString() + work();
	}
	
}
