package step05_network.fileex;

import java.io.FileWriter;
import java.io.IOException;

/* [���]
 * ���� ���: ��Ʈ(root)�� �������� ������ ã�´�.
 * ��� ���: ������ġ�� �������� ������ ã�´�.
 *               ./    --> ������ġ(��������)
 *               ../   --> ����(�� �ܰ� ����)
 *               /    -->  ��Ʈ(�ֻ���)
 */
public class FileWriterEx {
	public static void main(String[] args) throws IOException {
//		FileWriter writer=new FileWriter("./storage/data3.txt");                                            //��� ���
		FileWriter writer=new FileWriter("D:/cong/git/step01_basic/storage/data4.txt");    //���� ���
//		File file=new File("storage/data5.txt");
//		Writer writer=new FileWriter(file);
		
		StringBuilder str=new StringBuilder();
		str.append("���ع��� ��λ��� ������ �⵵��\n");
		str.append("�ϴ����� �����ϻ� �츮���� ����\n");
		str.append("����ȭ ��õ�� ȭ������\n");
		str.append("���ѻ�� �������� ���� �����ϼ�\n");
		
		writer.write(str.toString());
		writer.close();
		System.out.println("data3.txt�� �����߽��ϴ�.");
	}
}







