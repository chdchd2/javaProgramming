package step01_basic.switchEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����]
���ڸ� �Է��Ͻÿ� : 5

5�� Ȧ�� �Դϴ�
*/
public class SwitchEx2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		num = Integer.parseInt(br.readLine());
		
		switch(num%2) {
		case 0: 
			System.out.println(num+"�� ¦�� �Դϴ�.");
			break;
		case 1: 
			System.out.println(num+"�� Ȧ�� �Դϴ�.");
			break;
		}
		
		
	}
}
