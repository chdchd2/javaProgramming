package step05_network.object;

import java.io.Serializable;

//생성자 2개, +disp():void
public class User implements Serializable{   // 객체직렬화(한 줄만 써주면 됨)
	private String name;
	private int age;
	private double score;
	public User() {
		super();
	}
	public User(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public void disp(){
		System.out.println(name+"   "+age+"   "+ score);
	}
}








