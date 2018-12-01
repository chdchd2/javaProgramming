package step03_inheritance.inheritance;

class Branch{
	public Branch() {
		System.out.println("default Branch constructor"); //5
	}
	public Branch(String str) {
		this(); //4
		System.out.println(str + " " + "Branch constructor"); //6
	}
	public Branch(String str, int i) {
		this(str); //3
		System.out.println(str+ " " +i + " " + "Branch constructor"); //7
	}
}

class Leaf extends Branch{
	public Leaf(String str, int i) {
		super(str, i); //2
		System.out.println(str+ " " +i + " Leaf constructor"); //8
	}
}
public class InheritanceEx3 {
	public static void main(String[] args) {
		new Leaf("°¡³ª´Ù", 10); //1,9
	}
}

//-------------------------------------------------------------
/*class Branch{
	public Branch() { 
		System.out.println("default Branch constructor"); //4
	}
	public Branch(String str) {
		this(); //3
		System.out.println(str + " Branch constructor"); //5
	}
}

class Leaf extends Branch{
	public Leaf() {
		super("hellow"); //2
		System.out.println("default Leaf constructor"); //6
	}
}
public class InheritanceEx3 {
	public static void main(String[] args) {
		new Leaf(); //1 ,7
	}
}*/

/*

 */