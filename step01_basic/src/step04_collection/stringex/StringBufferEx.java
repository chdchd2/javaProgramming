package step04_collection.stringex;

public class StringBufferEx {
	public static void main(String[] args) {
/*		String buf="aaa";
		buf+="123";
		buf+="가나다";
		System.out.println(buf);*/
		//----------------------------------------------
		StringBuffer buf=new StringBuffer();           // 또는 StringBuilder
		buf.append("abc");
		buf.append("123");
		buf.append("가나다");
		
		System.out.println("용량:"+ buf.capacity());
		System.out.println("길이:"+ buf.length());
		System.out.println("test1:"+ buf);
		
		buf.reverse();
		System.out.println("test2:"+ buf);
		
		buf.delete(3, 6);
		System.out.println("test3:"+ buf);
		
		buf.trimToSize();
		System.out.println("용량:"+ buf.capacity());
	}
}







