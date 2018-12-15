package step05_network.clock;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.Random;

public class DigitalClock extends Frame implements Runnable{
	public DigitalClock(String title){
		super(title);
		Thread tt=new Thread(this);
		tt.setDaemon(true);
		tt.start();                 /* this  ==> implements Runnable가 없으면 Error */
		
		super.setBackground(Color.lightGray);
		super.setBounds(150, 150, 500, 150);
		super.setVisible(true);
		
		super.addWindowListener(
			new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e){
					System.exit(0);
				}
			});
	}
	@Override
	public void paint(Graphics g) {
		Random rd=new Random();
		int x=rd.nextInt(this.getWidth());    //윈도우의 폭을 구함
		int y=rd.nextInt(this.getHeight());   //윈도우의 높이를 구함
		
		int cr=rd.nextInt(256);
		int cg=rd.nextInt(256);
		int cb=rd.nextInt(256);
		int sh=rd.nextInt(2);
		
		g.setColor(new Color(cr, cg,cb));
		if(sh==0)
			g.fillRect(x, y, rd.nextInt(60), rd.nextInt(60));      //채워진 사각형
		else
			g.fillOval(x, y, rd.nextInt(60), rd.nextInt(60));      //채워진 타원형
		//----------------------------------------------------------------------------------------
		Calendar cal=Calendar.getInstance();
		int yy=cal.get(Calendar.YEAR);
		int mm=cal.get(Calendar.MONTH)+1;
		int dd=cal.get(Calendar.DATE);
		
		int hh=cal.get(Calendar.HOUR_OF_DAY);
		int min=cal.get(Calendar.MINUTE);
		int ss=cal.get(Calendar.SECOND);
		
		String date="오늘은 " + yy +"년 " + mm +"월 " + dd +"일 입니다.";
		String time="현재시간은 "+hh +":" + min +":" + ss+"초 입니다";
		
		g.setFont(new Font("맑은고딕", Font.BOLD, 20));
		g.setColor(Color.BLACK);
		
		g.drawString(date, 90, 70);
		g.drawString(time, 90, 110);
		
		super.paint(g);
	}
	@Override
	public void run() {
		while(true){
			try{
				Thread.sleep(1000);
				repaint();                               // update()  -> paint()  (화면을 무효화 -> 복구)
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}











