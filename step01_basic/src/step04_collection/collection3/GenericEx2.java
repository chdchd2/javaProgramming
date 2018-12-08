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
		GenericEx2<?> m = new GenericEx2<String>("호랑이");
		System.out.println("동물 : " + m.getA());
		//m.setA("원숭이");	-- error
		//					   ?는 반드시 생성자를 통해서 데이터를 입력
		GenericEx2<?> s = new GenericEx2<Integer>(12);
		System.out.println("나이 : " + s.getA());
	}

}
