package step04_collection.homework;

import java.lang.reflect.Array;

public class Homework1 {

	public static void main(String[] args) {
		String str = "IT ELITE";
		
		char str1 = (char)(str.charAt(4));
		char str2 = (char)(str.charAt(6));
		String str3 = str.toLowerCase();
		String str4 = str.substring(0, 2);
		String str5 = str.substring(3);
		String str6 = str.substring(0,1);
		String str7 = str6.toLowerCase();
		String str8 = str.substring(1,5);
		String str9 = str.substring(6);
		
		
		
		System.out.println(str1+" "+str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str7+str8+str7+str9);
		
	}

}
