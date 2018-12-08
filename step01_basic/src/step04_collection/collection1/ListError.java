package step04_collection.collection1;


import java.util.ArrayList;
import java.util.List;

//컴파일상의 문제는 없으나 실행 시에 형변환의 문제가 발생한다.
public class ListError {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(new Integer(10));
		list.add("겨울");
		list.add(4.0);
		list.add(10.0f);
		
		for(int i=0; i<list.size(); i++){
			String season=(String)list.get(i);  // 13번째 line에서 오류발생(ClassCastException)
			System.out.println(season);
		}
	}
}

















