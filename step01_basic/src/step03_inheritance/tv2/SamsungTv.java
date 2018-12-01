 package step03_inheritance.tv2;

public class SamsungTv implements Tv{
	@Override
	public void powerOn() {
		System.out.println("SamSung TV-전원을 켠다");
	}
	@Override
	public void powerOff() {
		System.out.println("SamSung TV-전원을 끈다");
	}
	@Override
	public void soundUp() {
		System.out.println("SamSung TV-소리를 높힌다");
	}
	@Override
	public void soundDown() {
		System.out.println("SamSung TV-소리를 줄인다");
	}
}
