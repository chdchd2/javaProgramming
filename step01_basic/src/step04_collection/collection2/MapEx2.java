package step04_collection.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("aaa", "kim");
		map.put("bbb", "lee");
		map.put("ccc", "park");
		map.put("ddd", "hong");
		map.put("eee", "kang");
		
		Set<String> keys = map.keySet();
		List<String> list = new ArrayList<>(keys);
		Collections.sort(list);
		for (String n : list) {
			System.out.println(map.get(n));
		}
	}
}
