package step04_collection.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked exception
public class ExceptionEx3 {
	String str;

	public ExceptionEx3() //throws IOException 
	{
		try {
			input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ڿ��� �Է��Ͻÿ�:");
			str = br.readLine();
	}

	public void output() {
		System.out.println("��� : " + str);
	}

	public static void main(String[] args) //throws IOException 
	{
		new ExceptionEx3().output();
	}
}
