package step02_method.constructorex;

/*
Ŭ������ : Student
-name:String
-kor:int
-mat:int
-eng:int

+Student()
+Student(name:String,kor:int,mat:int,eng:int)
+setter&getter
+toString():String

+getTotal():int                 <---- kor+eng+mat �� ����
+getAvg():double             <---- getTotal()�� 3���� ����� ����� ������ ����
+getGrade():char              <---- getAvg()�� �̿��ؼ� A,B,C,D,F������ ���ؼ� ����
*/
public class Student {
	private String name;
	private int kor;
	private int mat;
	private int eng;
	
	public Student() {
	}
	public Student(String name, int kor, int mat, int eng) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return name + "�� ������ " + getTotal() +"�� �̸�, ����� " + getAvg() 
				  +"�̰� ������ " + getGrade() +"�Դϴ�";
	}
	public int getTotal(){
		return  kor+eng+mat;
	}
	public double getAvg(){
		return  (double)getTotal()/3;
	}
	public char getGrade(){
		switch((int)getAvg()/10)
		{
		case 10: case 9: return 'A';
		case 8:            return 'B';
		case 7:            return 'C';
		case 6:            return 'D';
		default:           return 'F';
		}
	}
}




