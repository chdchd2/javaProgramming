package step03_inheritance.animal;

import java.util.Scanner;

//�������ε�(dymamic binding): ������ ������ ȣ�� �޼��带 �̹� �˰� �ִ�.
public class AnimalMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Animal ani = null;

		while (true) {
			System.out.print("1.Dog    2.Cat   3.Duck   4.Fish   5.Exit\nSelect: ");
			n=sc.nextInt();
			
			switch(n) {
			case 1:
				ani = new Dog();
				break;
			case 2:
				ani = new Cat();
				break;
			case 3:
				ani = new Duck();
				break;
			case 4:
				ani = new Fish();
				break;
			default:
				System.out.println("�۾��� �����մϴ�");
				sc.close();
				System.exit(0);
			
			}
			ani.speak();
			ani.walk();

		}
	}
}
