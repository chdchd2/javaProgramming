package step03_inheritance.homework.test20;
/*
[문제20]생성자 함수를 overloading하여 두수중 큰수를 출력하는 
            프로그램을 완성하시오.(단, 계산과 출력은 생성자에서 할것)

public static void main(String[] args) 
{
     Test20 ob1 = new Test20(10,20);
     Test20 ob2 = new Test20(12.4, 9.45);
     Test20 ob3 = new Test20('Z', 'p');
}

--출력--
max = 20
max = 12.4
max = p 
*/
public class Test20 {
	
	public Test20(int i, int j) {
		if(i>j) {
			System.out.println("max="+i);
		}else {
			System.out.println("max="+j);
		}
	}

	public Test20(double d, double e) {
		if(d>e) {
			System.out.println("max="+d);
		}else {
			System.out.println("max="+e);
			
		}
	}
	
	public Test20(char a, char b) {
		if(a>b) {
			System.out.println("max="+a);
		}else {
			System.out.println("max="+b);
			
		}
		
	}

	public static void main(String[] args) {
	     Test20 ob1 = new Test20(10,20);
	     Test20 ob2 = new Test20(12.4, 9.45);
	     Test20 ob3 = new Test20('Z', 'p');
	}

}
