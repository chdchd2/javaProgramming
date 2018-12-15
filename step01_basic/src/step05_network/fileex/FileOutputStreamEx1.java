package step05_network.fileex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		OutputStream out=new FileOutputStream("src/step05_network/fileex/data1.txt");
		
		String name="ȫ�浿";
		int age=25;
		double tall=183.4;
		
		out.write(name.getBytes());
		//out.write(age);             // �̷��� �����ϸ� �ȵ�
		out.write(Integer.toString(age).getBytes());
		out.write(Double.toString(tall).getBytes());
		
		//��� byte stream filtering
		PrintStream ps=new PrintStream(out);
		ps.printf("\n\n\r�̸�:%s   ����:%d   Ű:%.1f\n", name, age, tall);
		
		//��� character stream filtering
		PrintWriter pw=new PrintWriter(out);
		pw.printf("\n\n\rname:%s   age:%d   tall:%.1f\n", name, age, tall);
		pw.flush();
		
		System.out.println("data1.txt�� ���� �߽��ϴ�.");
		pw.close();
		ps.close();
		out.close();
	}
}










