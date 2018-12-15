package step05_network.ioex;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamEx2 {
	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("src/step05_network/ioex/result.txt");
			DataInputStream dis=new DataInputStream(file);
			
			System.out.println("�̸�:" + dis.readUTF());
			System.out.println("����:" + dis.readInt());
			System.out.println("����:" + dis.readDouble());
			
			System.out.println("�̸�:" + dis.readUTF());
			System.out.println("����:" + dis.readInt());
			System.out.println("����:" + dis.readDouble());
			
			file.close();
			dis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




