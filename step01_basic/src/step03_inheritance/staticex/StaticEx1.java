package step03_inheritance.staticex;

class Test{
    int a;
    int b;
    static int c;

    static {
    	System.out.println("static�� �ʱ�ȭ ����");
    }
    public Test(int a, int b, int c1){
          this.a=a;
          this.b=b;
          c=c1;
          System.out.println("��ü�� �ʱ�ȭ ����");
    }
    public void view() {
    	System.out.println(a+"  "+b+"  "+c);
    }
}
public class StaticEx1 {
	public static void main(String[] args) {
		Test ob1=new Test(1,2,3);
        Test ob2=new Test(5,6,7);
        ob1.view();
        ob2.view();
	}
}
