package step04_collection.test;

import java.util.ArrayList;

//데이터베이스와 연동(비즈니스 로직처리)
public class BookProc {
	public ArrayList<Book> getList() {
		Book bk1=new Book("java","kim",100);
		Book bk2=new Book("C++","lee",250);
		Book bk3=new Book("JSP","park",150);
		
		ArrayList<Book> list=new ArrayList<Book>();
		/*
		 *  list에 bk1, bk2, bk3를 추가하시오 
		 */
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		return list;
	}
}





