package step05_network.fileex;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream out=new FileOutputStream("src/step05_network/fileex/data2.txt");
		int val;
		
		System.out.println("���ڿ��� �Է��ϰ� �������ٿ��� CTRL+Z�� �����ϼ���");
		while((val=System.in.read()) != -1){
			out.write(val);
		}
		out.flush();
		out.close();
		System.out.println("data2.txt�� �����߽��ϴ�.");
	}
}










