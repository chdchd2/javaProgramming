package step04_collection.exception;


//unchecked exception
public class ExceptionEx2 {
	public static void main(String[] args) {
		int[] num = {10, 20, 30};
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println(num[i]);
			}			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 갯수가 부족함");
		}
	}
}
