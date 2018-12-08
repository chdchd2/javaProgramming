package step04_collection.collection3;

//Generic Class : 특정 형식에 고정되어 있지 않는 데이터들을 캡슐화 한다.
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
		m.setOb("홍길동");
		System.out.println("이름 : " + m.getOb());
		//m.setOb(100);
		
		GenericEx1<Integer> s = new GenericEx1<>();
		s.setOb(25);
		System.out.println("나이 : " + s.getOb());
	}

}
