package step05_network.ioex;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx1 {
	public static void main(String[] args) {
		try {
			FileOutputStream file=new FileOutputStream("src/step05_network/ioex/result.txt");
			DataOutputStream dos=new DataOutputStream(file);
			
			dos.writeUTF("�ڷ����");
			dos.writeInt(3);
			dos.writeDouble(153.4);
			
			dos.writeUTF("�Ѻ�");
			dos.writeInt(2);
			dos.writeDouble(134.4);
			
			file.close();
			dos.close();
			System.out.println("result.txt ���Ϸ� �����߽��ϴ�.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




