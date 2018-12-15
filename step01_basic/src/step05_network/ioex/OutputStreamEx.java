package step05_network.ioex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamEx {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		BufferedWriter bw=new BufferedWriter(osw);
		
		String str1="가나다abcd1234$%#!";
		bw.write("test1:"+str1);
		bw.flush();            // 내보내고 버퍼비우기
		
		String str2="Hava a nice day";
		bw.write("\ntest2:"+str2);
		bw.flush();
		
		osw.close();
		bw.close();
		//-------------------------------------------------------------------------------------
/*		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		
		String str1="가나다abcd1234$%#!";
		osw.write("test1:"+str1);              // System.out.println() 동일
		
		String str2="Hava a nice day";
		osw.write("\ntest2:"+str2);
		
		osw.close();*/
	}
}






