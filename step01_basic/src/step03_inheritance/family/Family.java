package step03_inheritance.family;

public class Family {
	private String name;

	
	public Family() {
		super();
	}


	public Family(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "¿Ã∏ß : " + name + "\n" ;
	}
	
	
	
	
}
