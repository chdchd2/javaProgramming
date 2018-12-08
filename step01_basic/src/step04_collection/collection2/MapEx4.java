package step04_collection.collection2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx4 {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put("고길동", "객실1");
		map.put("둘리", "객실2");
		map.put("또치", "객실2");
		map.put("마이콜", "객실1");
		map.put("도우넛", "객실3");
		map.put("희동이", "객실4");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("방이름(객실1~객실4):");
		String room=sc.next();
		
		Set<String> keys=map.keySet();
		for(String k:keys) {
			String rom=(String)map.get(k);
			
			if(rom.equals(room)) {
				System.out.println(room+"에 있는 사용자는 " + k + "입니다");
			}
		}
		sc.close();

	}

}
