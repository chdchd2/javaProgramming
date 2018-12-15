package step05_network.fileex;

import java.io.FileWriter;
import java.io.IOException;

/* [경로]
 * 절대 경로: 루트(root)를 기준으로 파일을 찾는다.
 * 상대 경로: 현재위치를 기준으로 파일을 찾는다.
 *               ./    --> 현재위치(생략가능)
 *               ../   --> 상위(한 단계 위로)
 *               /    -->  루트(최상위)
 */
public class FileWriterEx {
	public static void main(String[] args) throws IOException {
//		FileWriter writer=new FileWriter("./storage/data3.txt");                                            //상대 경로
		FileWriter writer=new FileWriter("D:/cong/git/step01_basic/storage/data4.txt");    //절대 경로
//		File file=new File("storage/data5.txt");
//		Writer writer=new FileWriter(file);
		
		StringBuilder str=new StringBuilder();
		str.append("동해물과 백두산이 마르고 닳도록\n");
		str.append("하느님이 보우하사 우리나라 만세\n");
		str.append("무궁화 삼천리 화려강상\n");
		str.append("대한사람 대한으로 길이 보전하세\n");
		
		writer.write(str.toString());
		writer.close();
		System.out.println("data3.txt로 저장했습니다.");
	}
}







