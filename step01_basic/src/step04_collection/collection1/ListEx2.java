package step04_collection.collection1;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<Object>();
		list.add("one");
		list.add(2);         
		list.add(new Float(3.0f));
		list.add("one");
		list.add(4.00);
		list.add(new Integer(2));
		System.out.println(list);
		
		for (Object ob : list) {
			System.out.println(ob);
		}
		/*Iterator<Object> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}*/
	}
}
