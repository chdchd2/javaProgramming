package step05_network.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputMain {
	public static void main(String[] args) {
		User ob1=new User("�ε鷹", 25, 89.5);
		User ob2=new User("������", 27, 100.0);
		
		//��ü ����ȭ---------------------------------------
		try{
			ObjectOutputStream ob=new ObjectOutputStream(
					                         new FileOutputStream("storage/user.txt"));
			
			ob.writeObject(ob1);
			ob.writeObject(ob2);
			ob.close();
			System.out.println("��ü�� ����Ǿ����ϴ�.");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}









