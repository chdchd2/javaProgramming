package step04_collection.stringex;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Today{
	public void print(){
//		System.out.println("���� ��¥:" + new Date());
		
//		Calendar cal=new GregorianCalendar();
		Calendar cal=Calendar.getInstance();
		
		System.out.println("���� ��¥ : " 
								+ cal.get(Calendar.YEAR)+"��" 
								+ (cal.get(Calendar.MONTH)+1) +"��"
								+ cal.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println("���� �ð� : " 
		         + cal.get(Calendar.HOUR_OF_DAY)+"��"
		         + cal.get(Calendar.MINUTE )+"��"
		         + cal.get(Calendar.SECOND)+"��");
	}
}
public class CalendarEx {
	public static void main(String[] args) {
		new Today().print();
	}
}







