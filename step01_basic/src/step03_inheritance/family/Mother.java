package step03_inheritance.family;

public class Mother extends Family implements Job {
	
	
	public Mother() {
		super();
	}

	
	public Mother(String name) {
		super(name);
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "엄마는 집안일을 한다";
	}


	@Override
	public String toString() {
		return super.toString() + work();
	}
	
	
}
