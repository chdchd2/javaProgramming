package step04_collection.collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//Set: �ߺ�X, ��������X
public class SetEx {
	@SuppressWarnings("unchecked")  // type�� Ȯ������ �ʴ� Annotation
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("one");
		set.add(2);         // int --> Integer��ȯ(auto boxing)
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
