package step03_inheritance.homework.test22;

public class SubEntry extends Entry{
	private String definition;
	private int year;
	public SubEntry() {
		super();
	}
	public SubEntry(String word, String definition, int year) {
		super(word);
		this.definition=definition;
		this.year=year;
		
	}
	
	public void printView() {
		System.out.println("���� : "+definition+"\n�ñ� : "+year );
	}
	
	
}
