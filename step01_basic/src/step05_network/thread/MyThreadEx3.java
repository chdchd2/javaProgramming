package step05_network.thread;

public class MyThreadEx3 implements Runnable{
	String str;
	int num;
	
	public MyThreadEx3(String str, int num){
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
		new Thread(new MyThreadEx3("one",100)).start();
		new Thread(new MyThreadEx3("two",100)).start();
		new Thread(new MyThreadEx3("three",100)).start();
		
/*		MyThreadEx3 ob1=new MyThreadEx3("one",100);
		MyThreadEx3 ob2=new MyThreadEx3("two",100);
		MyThreadEx3 ob3=new MyThreadEx3("three",100);
		
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		Thread t3=new Thread(ob3);
		
		t1.start();
		t2.start();
		t3.start();*/
	}
}
/* start()�� ������(VMThread)�� �����ϰ�, ���Ӱ� ������� Thread�� run()�� 
 * �����Ѵ�. run()�� ���� Runnable��ü�� run()�޼��带 ȣ���ϴ� ���̴�
 * 
 * ��, start()�� �ϱ����� new Thread()�� ���� �ϳ��� ��ü�� ���̰� start()��
 * �ؾ߸� ���� Thread�� ��������� ���̴�
 */









