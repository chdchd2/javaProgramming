package step04_collection.collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {
	public static void main(String[] args) {

		Book ob1 = new Book("java", "kim", 150);
		Book ob2 = new Book("c++", "lee", 250);
		Book ob3 = new Book("oracle", "park", 100);
	
		Map<String, Book> map = new HashMap<>();
		map.put(ob1.getTitle(), ob1);
		map.put(ob2.getTitle(), ob2);
		map.put(ob3.getTitle(), ob3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는 도서명 : ");
		String title = sc.next();
		
		if(map.get(title) == null) {
			System.out.println("찾는 도서 없음");
		} else {
			System.out.println(map.get(title).getTitle());
			System.out.println(map.get(title).getAuthor());
			System.out.println(map.get(title).getPage());
		}
		
		sc.close();
	}
}
