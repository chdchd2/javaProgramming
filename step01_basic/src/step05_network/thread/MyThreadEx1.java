package step05_network.thread;

//단일쓰레드(single thread)
public class MyThreadEx1 {
	String str;
	int num;
	
	public MyThreadEx1(String str, int num){
		this.str=str;
		this.num=num;
	}
	public void view(){
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
		MyThreadEx1 ob1=new MyThreadEx1("one",100);
		MyThreadEx1 ob2=new MyThreadEx1("two",100);
		MyThreadEx1 ob3=new MyThreadEx1("three",100);
		
		ob1.view();
		ob2.view();
		ob3.view();
	}
}
















