package step03_inheritance.tv2;

// 다형성을 이용해서 결합도를 낮춤
public class TvUser {
	public static void main(String[] args) {
		String in=args[0];
		Tv tv=null;
		
		if(in.equals("lg")){
			tv=new LgTv();
		}else if(in.equals("samsung")){
			tv=new SamsungTv();
		}else{
			System.out.println("error");
			return;
		}
		tv.powerOn();
		tv.powerOff();
		tv.soundUp();
		tv.soundDown();
	}
}
