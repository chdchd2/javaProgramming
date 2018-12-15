package step05_network.fileex;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file=new File("storage/data3.txt");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		
		byte[] buf=new byte[(int)file.length()];
		bis.read(buf, 0, buf.length);
		System.out.println(new String(buf));
		bis.close();
		
		//-------------------------------------------------------------------
//		File file=new File("storage/data3.txt");
//		Reader reader=new FileReader(file);
//		
//		int ch;
//		while((ch=reader.read()) != -1){
//			System.out.print((char)ch);
//			//Thread.sleep(100);
//		}
//		reader.close();
	}
}






