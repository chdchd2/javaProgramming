package step04_collection.homework;

import java.util.StringTokenizer;

public class homework2 {
	public static void main(String[] args) {
		String str = "10*30*20*40*50";
		
		StringTokenizer tokens = new StringTokenizer(str, "*");
		System.out.println("�Ľ��� ���ڿ��� ��:" + tokens.countTokens() +"��");
		while(tokens.hasMoreElements()){
			System.out.println(tokens.nextToken());
		}
	}
}
