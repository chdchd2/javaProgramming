package step05_network.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputMain {
	public static void main(String[] args) {
		User ob1=new User("민들레", 25, 89.5);
		User ob2=new User("개나리", 27, 100.0);
		
		//객체 직렬화---------------------------------------
		try{
			ObjectOutputStream ob=new ObjectOutputStream(
					                         new FileOutputStream("storage/user.txt"));
			
			ob.writeObject(ob1);
			ob.writeObject(ob2);
			ob.close();
			System.out.println("객체가 저장되었습니다.");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}









