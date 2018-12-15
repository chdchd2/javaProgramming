package step05_network.thread;

/*데몬쓰레드(daemon thread)
 * 일반쓰레드가 모두 종료되면 데몬쓰레드를 강제로 종료한다	
 * 일반쓰레드가 종료되면 데몬쓰레드의 존재 의미가 없기 때문이다
 * ex) 워드프로세서의 자동저장, 화면 자동 갱신등
 */
class Damon extends Thread{
	@Override
	public void run() {
		while(true){
			try{
				Thread.sleep(300);
				System.out.println("Hello");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class MyThreadEx4 {
	public static void main(String[] args) {
		Damon th=new Damon();
		th.setDaemon(true);  // true : main이 종료되면 데몬도 종료
		th.start();
		
		int n=0;
		while(n<10){
			n++;
			try{
				Thread.sleep(300);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}






