package step05_network.thread;
import java.lang.Thread;

//다중쓰레드(Multiple Thread)
public class MyThreadEx2 extends Thread{
	String str;
	int num;
	
	public MyThreadEx2(String str, int num){
		this.str=str;
		this.num=num;
	}
	@Override
	public void run(){
		for(int i=1; i<=100; i++){
			System.out.println(str +":"+i);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new MyThreadEx2("one",100).start();
		new MyThreadEx2("two",100).start();
		new MyThreadEx2("three",100).start();
		
/*		MyThreadEx2 ob1=new MyThreadEx2("one",100);
		MyThreadEx2 ob2=new MyThreadEx2("two",100);
		MyThreadEx2 ob3=new MyThreadEx2("three",100);
		
		ob1.start();
		ob2.start();
		ob3.start();*/
	}
}





