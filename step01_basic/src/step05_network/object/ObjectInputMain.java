package step05_network.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputMain {
	public static void main(String[] args) {
		try{
			ObjectInputStream ob=new ObjectInputStream(
					                         new FileInputStream("storage/user.txt"));
			
			User ob1=(User)ob.readObject();
			User ob2=(User)ob.readObject();
			ob1.disp();
			ob2.disp();
			
			ob.close();
			
		}catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
