package step01_basic.ifEx;

public class IfEx1 {
	public static void main(String[] args) {
		//if��
		/*String id="abcd";
		if(id=="abcd") {
			System.out.println(id+"���� �α����ϼ̽��ϴ�.");
			System.out.println("���� ����Ʈ�� 2500���Դϴ�.");
		}
		
		System.out.println("** ��ſ� ���� �Ǽ��� **");*/
		
		//if~else��
		/*int score = 75;
		if(score>=60) {
			System.out.println("�հ�");
			System.out.println("����� ������ "+score+"�� �Դϴ�.");
		}else {
			System.out.println("���հ�");
			System.out.println("������ ������ "+score+"�� �Դϴ�.�絵�����ֽñ� �ٶ��ϴ�.");
		}
		*/
		
		//if~else if��
	/*	int score=93;
		char grade;
		if(score>=90) grade = 'A';
		else if(score>=80) grade = 'B';
		else if(score>=70) grade = 'C';
		else if(score>=60) grade = 'D';
		else grade = 'F';
		
		System.out.println("���� ������ "+score+"���̰�, "+grade+"���� �Դϴ�.");*/
		
		int score=120;
		char grade = '\0';
		if(score>100 || score <0) {
			System.out.println("�����Ϳ����Դϴ�. ������ Ȯ�����ּ���. ");
			return;
		}
		
		if(score>=90 && score<=100) grade = 'A';
		if(score>=80 && score<90) grade = 'B';
		if(score>=70 && score<80) grade = 'C';
		if(score>=60 && score<70) grade = 'D';
		if(score>=0 && score<60) grade = 'F';
		
		System.out.println("���� ������ "+score+"���̰�, "+grade+"���� �Դϴ�.");
	}
}
