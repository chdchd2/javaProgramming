 package step03_inheritance.tv2;

public class SamsungTv implements Tv{
	@Override
	public void powerOn() {
		System.out.println("SamSung TV-������ �Ҵ�");
	}
	@Override
	public void powerOff() {
		System.out.println("SamSung TV-������ ����");
	}
	@Override
	public void soundUp() {
		System.out.println("SamSung TV-�Ҹ��� ������");
	}
	@Override
	public void soundDown() {
		System.out.println("SamSung TV-�Ҹ��� ���δ�");
	}
}
