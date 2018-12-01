package step03_inheritance.homework.test22;

public class Entry {
	private String word;

	public Entry() {
		super();
		System.out.println("*** 약어사전 ***");
	}

	public Entry(String word) {
		this();
		this.word = word;
	}
	
	public void writeView()	{
		System.out.println("약어 : " + word);
	}
	
}
