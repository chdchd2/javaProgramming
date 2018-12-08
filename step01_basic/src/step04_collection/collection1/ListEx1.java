package step04_collection.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List: 중복O, 순서유지O
public class ListEx1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("one");
		list.add(2);         
		list.add(new Float(3.0f));
		list.add("one");
		list.add(4.00);
		list.add(new Integer(2));
		System.out.println(list);
		
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

