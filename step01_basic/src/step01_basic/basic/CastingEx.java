package step01_basic.basic;

public class CastingEx {
	public static void main(String[] args) {
		/*byte a = 100;
		int b = a;		//�ڵ�����ȯ
		
		double c = 73.45;
		int d = (int) c; //��������ȯ
		
		System.out.println(a+"  "+b);
		System.out.println(c+"  "+d);*/
		
		//---------------------------------------------------
		
	/*	int k=87, e=88, m=75;
		int tot = k+e+m;
		//double avg = tot/3.0;		//�ڵ�����ȯ
		double avg=(double)tot/3;	//��������ȯ
		
		System.out.printf("��� : %.2f��\n ", avg);*/
		
		//---------------------------------------------------
		
		int pay = 857650;
		double tax = 0.033;
		int result = pay-(int)(pay*tax) ;
														// hint:�޿�-(�޿�*����)
		System.out.println("������ ������ �ݾ�:" + result);  //829348
	}
}
