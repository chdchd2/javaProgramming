package step04_collection.collection3;

//Generic Class : Ư�� ���Ŀ� �����Ǿ� ���� �ʴ� �����͵��� ĸ��ȭ �Ѵ�.
public class GenericEx1<T> {
	T ob;
	
	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}


	public static void main(String[] args) {
		GenericEx1<String> m = new GenericEx1<>();
		m.setOb("ȫ�浿");
		System.out.println("�̸� : " + m.getOb());
		//m.setOb(100);
		
		GenericEx1<Integer> s = new GenericEx1<>();
		s.setOb(25);
		System.out.println("���� : " + s.getOb());
	}

}
