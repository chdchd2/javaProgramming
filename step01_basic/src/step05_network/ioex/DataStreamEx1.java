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
			
			dos.writeUTF("텔레토비");
			dos.writeInt(3);
			dos.writeDouble(153.4);
			
			dos.writeUTF("뚜비");
			dos.writeInt(2);
			dos.writeDouble(134.4);
			
			file.close();
			dos.close();
			System.out.println("result.txt 파일로 저장했습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




