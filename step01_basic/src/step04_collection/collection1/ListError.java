package step04_collection.collection1;


import java.util.ArrayList;
import java.util.List;

//�����ϻ��� ������ ������ ���� �ÿ� ����ȯ�� ������ �߻��Ѵ�.
public class ListError {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("��");
		list.add("����");
		list.add("����");
		list.add(new Integer(10));
		list.add("�ܿ�");
		list.add(4.0);
		list.add(10.0f);
		
		for(int i=0; i<list.size(); i++){
			String season=(String)list.get(i);  // 13��° line���� �����߻�(ClassCastException)
			System.out.println(season);
		}
	}
}

















