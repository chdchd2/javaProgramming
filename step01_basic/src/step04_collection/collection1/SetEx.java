package step04_collection.collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//Set: 중복X, 순서유지X
public class SetEx {
	@SuppressWarnings("unchecked")  // type을 확인하지 않는 Annotation
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("one");
		set.add(2);         // int --> Integer변환(auto boxing)
		set.add(new Float(3.0f));
		set.add("one");
		set.add(4.00);
		set.add(new Integer(2));
		System.out.println(set);
		
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
