package step03_inheritance.inheritance;

//�⺻������, ����4���޴»�����, to String() �߰�
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
		return super.toString()+"\n���� �μ��� " + dept + "�̰� �Ի������� " + score + "�� �Դϴ�";
	}
	
	
	
}
