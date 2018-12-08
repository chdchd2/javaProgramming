package step04_collection.collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(101, "kim");
		map.put(102, "lee");
		map.put(103, "park");
		map.put(104, "hong");
		map.put(105, "kang");
		
		System.out.println("101 : " + map.get(101));
	}
}
