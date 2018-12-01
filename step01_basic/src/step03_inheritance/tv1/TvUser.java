package step03_inheritance.tv1;

//$java TvUser lg

// 결합도 높다
public class TvUser {
	public static void main(String[] args) {
		String in=args[0]; // lg or samsung
		
		if(in.equals("lg")){
			LgTv tv=new LgTv();
			tv.turnOn();
			tv.turnOff();
			tv.soundUp();
			tv.soundDown();
		}else if(in.equals("samsung")){
			SamsungTv tv=new SamsungTv();
			tv.powerOn();
			tv.powerOff();
			tv.volumeUp();
			tv.volumeDown();
		}else{
			System.out.println("error");
		}
	}
}
