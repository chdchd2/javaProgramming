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
		return "�ƺ��� ������ ���� �Ѵ�";
	}


	@Override
	public String toString() {
		return super.toString() + work();
	}
	
	

}
