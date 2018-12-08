package step04_collection.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		Book ob1 = new Book("java", "kim", 150);
		Book ob2 = new Book("c++", "lee", 250);
		Book ob3 = new Book("oracle", "park", 100);
	
		List<Book> list = new ArrayList<>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		
		/*for (Book ob : list) {
			System.out.println("책이름 : " + ob.getTitle() + "\t저자 : " + ob.getAuthor() + "\t페이지 : "+ ob.getPage());
		}*/
		
		Iterator<Book> iter = list.iterator();
		while (iter.hasNext()) {
			Book ob =  iter.next();
			System.out.println("책이름 : " + ob.getTitle() + "\t저자 : " + ob.getAuthor() + "\t페이지 : "+ ob.getPage());
			
		}
	}
	
}
