package step01_basic.ifEx;

//중첩if문: if안에서 또 다른 if를 사용하는 것
public class IfEx2 {
	public static void main(String[] args) {
		int age = 47;
		
		if(age>=19) {
			if(age>45) {
				System.out.println("장년");
			} else {
				System.out.println("쳥년");
			}
		} else {
			System.out.println("미성년");
		}
	}
}
