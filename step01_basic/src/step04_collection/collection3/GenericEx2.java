package step04_collection.collection3;

public class GenericEx2<T> {

	T a;
	
	public GenericEx2(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public static void main(String[] args) {
		GenericEx2<?> m = new GenericEx2<String>("ȣ����");
		System.out.println("���� : " + m.getA());
		//m.setA("������");	-- error
		//					   ?�� �ݵ�� �����ڸ� ���ؼ� �����͸� �Է�
		GenericEx2<?> s = new GenericEx2<Integer>(12);
		System.out.println("���� : " + s.getA());
	}

}
