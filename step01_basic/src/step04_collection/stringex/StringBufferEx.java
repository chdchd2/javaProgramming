package step04_collection.stringex;

public class StringBufferEx {
	public static void main(String[] args) {
/*		String buf="aaa";
		buf+="123";
		buf+="������";
		System.out.println(buf);*/
		//----------------------------------------------
		StringBuffer buf=new StringBuffer();           // �Ǵ� StringBuilder
		buf.append("abc");
		buf.append("123");
		buf.append("������");
		
		System.out.println("�뷮:"+ buf.capacity());
		System.out.println("����:"+ buf.length());
		System.out.println("test1:"+ buf);
		
		buf.reverse();
		System.out.println("test2:"+ buf);
		
		buf.delete(3, 6);
		System.out.println("test3:"+ buf);
		
		buf.trimToSize();
		System.out.println("�뷮:"+ buf.capacity());
	}
}







