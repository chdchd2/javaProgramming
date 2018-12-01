package step01_basic.basic;

public class CastingEx {
	public static void main(String[] args) {
		/*byte a = 100;
		int b = a;		//자동형변환
		
		double c = 73.45;
		int d = (int) c; //강제형변환
		
		System.out.println(a+"  "+b);
		System.out.println(c+"  "+d);*/
		
		//---------------------------------------------------
		
	/*	int k=87, e=88, m=75;
		int tot = k+e+m;
		//double avg = tot/3.0;		//자동형변환
		double avg=(double)tot/3;	//강제형변환
		
		System.out.printf("평균 : %.2f점\n ", avg);*/
		
		//---------------------------------------------------
		
		int pay = 857650;
		double tax = 0.033;
		int result = pay-(int)(pay*tax) ;
														// hint:급여-(급여*세금)
		System.out.println("세금을 제외한 금액:" + result);  //829348
	}
}
