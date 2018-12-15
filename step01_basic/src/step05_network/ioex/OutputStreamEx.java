package step05_network.ioex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamEx {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		BufferedWriter bw=new BufferedWriter(osw);
		
		String str1="������abcd1234$%#!";
		bw.write("test1:"+str1);
		bw.flush();            // �������� ���ۺ���
		
		String str2="Hava a nice day";
		bw.write("\ntest2:"+str2);
		bw.flush();
		
		osw.close();
		bw.close();
		//-------------------------------------------------------------------------------------
/*		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		
		String str1="������abcd1234$%#!";
		osw.write("test1:"+str1);              // System.out.println() ����
		
		String str2="Hava a nice day";
		osw.write("\ntest2:"+str2);
		
		osw.close();*/
	}
}






