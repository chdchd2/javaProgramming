package step04_collection.stringex;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str="학교,집,학원,,게임방,술집,도서관";
		String[] values=str.split(",");
		for(int x=0; x<values.length; x++){
			System.out.println(values[x]);
		}
		
		//---------------------------------------------------------------------------------------
		/*String str="학교,집,학원,,게임방#술집$도서관";
		
		StringTokenizer tokens=new StringTokenizer(str,",#$");   //구분자 : , # $
		System.out.println("파싱할 문자열의 수:" + tokens.countTokens() +"개");
		while(tokens.hasMoreElements()){
			System.out.println(tokens.nextToken());
		}*/
	}
}
