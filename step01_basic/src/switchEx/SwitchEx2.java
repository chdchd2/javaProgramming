package switchEx;
/*[문제]
숫자를 입력하시오 : 5

5는 홀수 입니다
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
			System.out.println(num+"는 홀수입니다.");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println(num+"는 짝수입니다.");
			break;
		default:
			System.out.println("1-10의 범위 내에서 입력해주세요.");
		}
	}
}
