package step04_collection.stringex;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Today{
	public void print(){
//		System.out.println("오늘 날짜:" + new Date());
		
//		Calendar cal=new GregorianCalendar();
		Calendar cal=Calendar.getInstance();
		
		System.out.println("오늘 날짜 : " 
								+ cal.get(Calendar.YEAR)+"년" 
								+ (cal.get(Calendar.MONTH)+1) +"월"
								+ cal.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println("현재 시간 : " 
		         + cal.get(Calendar.HOUR_OF_DAY)+"시"
		         + cal.get(Calendar.MINUTE )+"분"
		         + cal.get(Calendar.SECOND)+"초");
	}
}
public class CalendarEx {
	public static void main(String[] args) {
		new Today().print();
	}
}







