package step02_method.objectex;

/*  
클래스명 : User
	+name:String              
	+k:int
	+e:int
	+m:int
	
	+setUser(name:String, k:int, e:int, m:int):void
	+getTotal():int
	+getUser():String   ==> "나의 이름은 강호동이고 총점은 231점입니다" 를 리턴
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
		return "나의 이름은 "+ name+ "이고, 총점은 "+ getTotal() +"점 입니다.";
	}
}












