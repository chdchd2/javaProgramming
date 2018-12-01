package step03_inheritance.inheritance;

//기본생성자, 인자4개받는생성자, to String() 추가
public class EmpScore extends Emp {
	private String dept;
	private double score;
	
	public EmpScore() {
		super();
	}
	public EmpScore(String name, String phone, String dept, double score) {
		super(name, phone);
		this.dept=dept;
		this.score=score;
	}
	@Override
	public String toString() {
		return super.toString()+"\n나의 부서는 " + dept + "이고 입사점수는 " + score + "점 입니다";
	}
	
	
	
}
