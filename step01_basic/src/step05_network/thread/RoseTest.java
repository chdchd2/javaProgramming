package step05_network.thread;

/* �������� �켱����
: setPriority()�޼��带 �̿��Ͽ� �켱������ �ο��Ѵ�(1~10)
  �켱������ ���� ������� �켱������ ���� �����忡 ���� ����ð��� ���� �Ҵ� �޴´�.
  �ٸ� �����忡 ���� ���� ����ð��� �ʿ�� �Ѵٸ� �켱������ ���� �θ� �ȴ�.

��) ä�ð� �ٿ�ε��� ��� ä���� �켱������ �����ش�.
MAX_PRIORITY    : �켱���� 10(�ְ����)
MIN_PRIORITY    : �켱���� 1(��������)
NORM_PRIORITY : �켱���� 5(���� ������)

join() : �� �������� ������ ���������� ����Ѵ�.
*/
//------------------------------------------------------------------------------------------
class Test1 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println("���");
			for(long x=0; x<1000000; x++);
		}
	}
}
class Test2 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println("���");
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
			System.out.println(flower+"\t" + Thread.currentThread());  //currentThread() : �������, �켱����, �׷�
		}
	}
	public static void main(String[] args) {
		RoseTest ob1=new RoseTest("���");
		RoseTest ob2=new RoseTest("���");
		RoseTest ob3=new RoseTest("����");
		
		ob1.start();
		try{
			ob1.join();          // ob1�� ������ ���� ob2, ob3�� ���
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		ob2.start();
		ob3.start();
	}
}
*/















