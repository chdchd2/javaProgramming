package switchEx;
/*[����]
���ڸ� �Է��Ͻÿ� : 5

5�� Ȧ�� �Դϴ�
*/
public class SwitchEx2 {
	public static void main(String[] args) {
		int num = 2;
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(num+"�� Ȧ���Դϴ�.");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println(num+"�� ¦���Դϴ�.");
			break;
		default:
			System.out.println("1-10�� ���� ������ �Է����ּ���.");
		}
	}
}
