package step03_inheritance.family;

public class Father extends Family implements Job{

	
	public Father() {
		super();
	}


	public Father(String name) {
		super(name);
	}


	
	
	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "아빠는 나가서 일을 한다";
	}


	@Override
	public String toString() {
		return super.toString() + work();
	}
	
	

}
