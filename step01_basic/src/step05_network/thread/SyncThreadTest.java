package step05_network.thread;
/*
실행순서의 동기화처리
 : 쓰레드의 실행순서를 정의 하고 반드시 따르도록 하는것
 
 ex) A쓰레드의 처리가 완료된후 B쓰레드가 처리되도록 하는 경우
 형식) 접근지정자 synchronized 메서드명(){  }
 */
class FamilyThread extends Thread{
	private Washroom wr;
	private String who;

	public FamilyThread(Washroom wr, String who){
		this.wr = wr;
		this.who = who;
	}  
	@Override
	public void run(){
		try {
			wr.openDoor(who);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}
//------------------------------------------------------------
class Washroom{
	public synchronized void openDoor(String name) throws InterruptedException {
		System.out.println(name + "님이 입장");
		for(int i=0; i<50000; i++){
			if(i%10000==0){
				Thread.sleep(2000);
				System.out.println(name+"님이 볼일보는중..");
			}
		}
		System.out.println(name + "님이 퇴장");
	}
}
//-----------------------------------------------------------
public class SyncThreadTest {
	public static void main(String[] args) {
		Washroom wr=new Washroom();
		
		FamilyThread father=new FamilyThread(wr, "father");
		FamilyThread mother=new FamilyThread(wr, "mother");
		FamilyThread sister=new FamilyThread(wr, "sister");
		FamilyThread brother=new FamilyThread(wr, "brother");
		FamilyThread me=new FamilyThread(wr, "me");

		father.start();
		mother.start();
		sister.start();
		brother.start();
		me.start();
	}
}






