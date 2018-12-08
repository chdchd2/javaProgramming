package step04_collection.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class LottoNumber {
	public static void main(String[] args) {
		
		//��������
		Set<Integer> set=new HashSet<>();
		while(set.size()<6){
			set.add((int)(Math.random()*45)+1);     // 1-45������ ��
		}
		List<Integer> list=new ArrayList<>(set);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(list);
		
		
		
		//��������
/*		Set<Integer> set=new HashSet<>();
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);   //1~45������ ��
		}
		List<Integer> list=new ArrayList<>(set);
		Collections.sort(list);  //�������� ����
		System.out.println(list);*/
	}
}








