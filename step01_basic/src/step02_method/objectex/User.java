package step02_method.objectex;

/*  
Ŭ������ : User
	+name:String              
	+k:int
	+e:int
	+m:int
	
	+setUser(name:String, k:int, e:int, m:int):void
	+getTotal():int
	+getUser():String   ==> "���� �̸��� ��ȣ���̰� ������ 231���Դϴ�" �� ����
*/
public class User {
	public String name;
	public int k;
	public int e;
	public int m;
	
	public void setUser(String name, int k, int e, int m){
		this.name=name;
		this.k=k;
		this.e=e;
		this.m=m;
	}
	public int getTotal(){
		return k+e+m;
	}
	public String getUser(){
		return "���� �̸��� "+ name+ "�̰�, ������ "+ getTotal() +"�� �Դϴ�.";
	}
}












