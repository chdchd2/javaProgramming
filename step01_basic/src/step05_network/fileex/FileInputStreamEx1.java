package step05_network.fileex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader isr=new FileReader("src/step05_network/fileex/data1.txt");
		BufferedReader br=new BufferedReader(isr);
		
		String str;
		while((str=br.readLine()) != null){
			System.out.println(str);
			Thread.sleep(500);
		}
		isr.close();
		br.close();
		//------------------------------------------------------------------------------
/*
		InputStreamReader isr=new FileReader("src/fileex/data1.txt");
		
		int readdata;
		while(true){
			readdata=isr.read();          //���ڷ� �д´�. �ѱ� ó������
			if(readdata==-1)             // -1 (End Of File : ������ ��)
				break;
			System.out.print((char)readdata);
			Thread.sleep(100);
		}
		isr.close();
	*/	
		
		//------------------------------------------------------------------------------

//		InputStream is=new FileInputStream("src/step05_network/fileex/data1.txt");
//		
//		int readdata;
//		while(true){
//			readdata=is.read();          //byte�� �д´�. �ѱ۱���
//			if(readdata==-1)             // -1 (End Of File : ������ ��)
//				break;
//			System.out.print((char)readdata);
//			Thread.sleep(100);
//		}
//		is.close();
		
	}
}







