package step03_inheritance.animal;

import java.util.Scanner;

//�������ε�(static binding): ������ ������ ȣ�� �޼��带 �̹� �˰� �ִ�.
public class AnimalMain1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		Dog ob1=null;   Cat ob2=null;  Duck ob3=null;    Fish ob4=null;
		
		while(true){
			System.out.print("1.Dog    2.Cat   3.Duck   4.Fish   5.Exit\nSelect: ");
			n=sc.nextInt();
			
			switch(n){
				case 1: 
					ob1=new Dog();		
					ob1.speak();  	
					ob1.walk(); 		
					break;
				case 2: 
					ob2=new Cat();		
					ob2.speak();  	
					ob2.walk(); 		
					break;
				case 3: 
					ob3=new Duck();	
					ob3.speak();  	
					ob3.walk(); 		
					break;
				case 4: 
					ob4=new Fish();		
					ob4.speak();  	
					ob4.walk(); 		
					break;
				default:  System.out.println("�۾��� �����մϴ�");
				            sc.close();
							System.exit(0);
			}
		}
	}
}











