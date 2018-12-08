package step04_collection.stringex;

public class StringEx {
	public static void main(String[] args) {
		String str1="korea";
		String str2=" fighting";
		
		//012345678901234
		//korea fighting
		String str3=str1.concat(str2);
		String str4=str3.substring(6,11);
		String str5=str3.substring(6);
		String str6=str3.toUpperCase();
		char s=str3.charAt(4);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(s);
		
		//------------------------------------------------------------
		/*String s1="Hello";
		String s2="Hello";
		String s3=s2;
		
		String s4=new String("Hello");
		String s5=new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		System.out.println(s4==s5);    // false
		System.out.println(s4.equals(s5));*/
	}
}
