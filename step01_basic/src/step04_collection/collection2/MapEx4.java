package step04_collection.collection2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx4 {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put("��浿", "����1");
		map.put("�Ѹ�", "����2");
		map.put("��ġ", "����2");
		map.put("������", "����1");
		map.put("�����", "����3");
		map.put("����", "����4");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���̸�(����1~����4):");
		String room=sc.next();
		
		Set<String> keys=map.keySet();
		for(String k:keys) {
			String rom=(String)map.get(k);
			
			if(rom.equals(room)) {
				System.out.println(room+"�� �ִ� ����ڴ� " + k + "�Դϴ�");
			}
		}
		sc.close();

	}

}
