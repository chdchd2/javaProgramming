package step04_collection.stringex;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str="�б�,��,�п�,,���ӹ�,����,������";
		String[] values=str.split(",");
		for(int x=0; x<values.length; x++){
			System.out.println(values[x]);
		}
		
		//---------------------------------------------------------------------------------------
		/*String str="�б�,��,�п�,,���ӹ�#����$������";
		
		StringTokenizer tokens=new StringTokenizer(str,",#$");   //������ : , # $
		System.out.println("�Ľ��� ���ڿ��� ��:" + tokens.countTokens() +"��");
		while(tokens.hasMoreElements()){
			System.out.println(tokens.nextToken());
		}*/
	}
}
