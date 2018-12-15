package step05_network.thread;

/* 쓰레드의 우선순위
: setPriority()메서드를 이용하여 우선순위를 부여한다(1~10)
  우선순위가 높은 쓰레드는 우선순위가 낮은 쓰레드에 비해 실행시간을 많이 할당 받는다.
  다른 쓰레드에 비해 많은 실행시간을 필요로 한다면 우선순위를 높게 두면 된다.

예) 채팅과 다운로드의 경우 채팅의 우선순위를 높여준다.
MAX_PRIORITY    : 우선순위 10(최고순위)
MIN_PRIORITY    : 우선순위 1(최저순위)
NORM_PRIORITY : 우선순위 5(순위 미지정)

join() : 한 쓰레드의 동작이 끝날때까지 대기한다.
*/
//------------------------------------------------------------------------------------------
class Test1 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println("장미");
			for(long x=0; x<1000000; x++);
		}
	}
}
class Test2 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println("사랑");
			for(long x=0; x<1000000; x++);
		}
	}
}
public class RoseTest{
	public static void main(String[] args) {
		Test1 ob1=new Test1();
		Test2 ob2=new Test2();
		
		ob1.setPriority(10);
		ob2.setPriority(1);
		
		ob1.start();
		ob2.start();		
	}
}

//------------------------------------------------------------------------------------------
/*
public class RoseTest extends Thread{
	private String flower;
	
	public RoseTest(String flower){
		this.flower=flower;
	}
	@Override
	public void run() {
		for(int i=1; i<=500; i++){
			try{
				Thread.sleep(5);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(flower+"\t" + Thread.currentThread());  //currentThread() : 스레드명, 우선순위, 그룹
		}
	}
	public static void main(String[] args) {
		RoseTest ob1=new RoseTest("장미");
		RoseTest ob2=new RoseTest("사랑");
		RoseTest ob3=new RoseTest("가시");
		
		ob1.start();
		try{
			ob1.join();          // ob1이 끝날때 까지 ob2, ob3는 대기
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		ob2.start();
		ob3.start();
	}
}
*/















