package step05_network.object;

import java.io.Serializable;

//������ 2��, +disp():void
public class User implements Serializable{   // ��ü����ȭ(�� �ٸ� ���ָ� ��)
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








