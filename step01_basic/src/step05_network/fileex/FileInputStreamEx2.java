package step05_network.fileex;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileInputStreamEx2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		//FileReader ob=new FileReader("src/step05_network/fileex/data2.txt");
		Reader ob=new FileReader("src/fileex/data2.txt");
		
		int ch;
		while((ch=ob.read()) != -1){
			System.out.print((char)ch);
			Thread.sleep(100);
		}
		ob.close();
	}
}











