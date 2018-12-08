package step04_collection.test;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String id;
		String pw;
		
		System.out.print("ID�� �Է��Ͻÿ�:");  id=sc.next();
		System.out.print("PW�� �Է��Ͻÿ�:");  pw=sc.next();
		
		UserProc up=new UserProc();
		User entity=up.getLoginUser(id,pw);
		
		if(entity != null){
			 System.out.println("\n"+entity.getName()+"���� �����ϼ̽��ϴ�");  
			System.out.println("���������ʹ� "+ entity.getPoint()+"�� �Դϴ�"); 
			
			BookProc book = new BookProc();
			ArrayList<Book> list = book.getList();
			
			System.out.println("\n[[BOOK�� ��������]]");
			for (Book ob : list) {
				System.out.println("å�̸� : " + ob.getTitle() + "\tå���� : " + ob.getAuthor() + "\t������ : " + ob.getPage());
			}
		}else{
			System.out.println("ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�");
		}				
	}
}
/*
 * ID�� �Է��Ͻÿ� : pororo
 * PW�� �Է��Ͻÿ� : 1234
 * 
 * �Ƿηδ��� �����ϼ̽��ϴ�
 * ���������ʹ� 89.97�� �Դϴ�
 * 
 * 
 * [[BOOk�� ��������]]
 * å�̸�:JAVA    å����:kim      ������: 100
 * å�̸�:C++     å����:lee       ������: 250
 * å�̸�:JSP      å����:park     ������: 150
 * 
 * -----------------------------------------------------
 * ID�� �Է��Ͻÿ� : pororo
 * PW�� �Է��Ͻÿ� : 1111
 * 
 * ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�
 * 
 */























