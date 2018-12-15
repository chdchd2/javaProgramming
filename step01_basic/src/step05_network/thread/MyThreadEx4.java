package step05_network.thread;

/*���󾲷���(daemon thread)
 * �Ϲݾ����尡 ��� ����Ǹ� ���󾲷��带 ������ �����Ѵ�	
 * �Ϲݾ����尡 ����Ǹ� ���󾲷����� ���� �ǹ̰� ���� �����̴�
 * ex) �������μ����� �ڵ�����, ȭ�� �ڵ� ���ŵ�
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
		th.setDaemon(true);  // true : main�� ����Ǹ� ���� ����
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






