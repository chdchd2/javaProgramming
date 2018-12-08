package step04_collection.instanceofEx;


//직군별로 보너스를 다르게 지급
abstract class Employee{
	String name;
	int salary;
	
	public Employee() {
		super();
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	abstract public int getBonus();   //정규보너스
	
	@Override
	public String toString() {
		return name + "\t" + salary;
	}
}
//--------------------------------------------------------
class Engineer extends Employee{
	public Engineer() {
		super();
	}
	public Engineer(String name, int salary) {
		super(name, salary);
	}
	@Override
	public int getBonus() {
		return 150000;
	}
	@Override
	public String toString() {
		return super.toString()+"  \t"+getBonus();
	}
}
//--------------------------------------------------------
class Developer extends Employee{
	public Developer() {
		super();
	}
	public Developer(String name, int salary) {
		super(name, salary);
	}
	@Override
	public int getBonus() {
		return 100000;
	}
	@Override
	public String toString() {
		return super.toString()+"  \t"+getBonus();
	}
}
//--------------------------------------------------------
public class InstanceofEx2 {
	public static void main(String[] args) {
		Employee[] em=new Employee[]{new Engineer("kim", 1200000),
				                     new Developer("lee", 1750000),
				                     new Engineer("park", 2500000),
				                     new Developer("hong", 2350000)};
		
		/* Engineer는 급여의 13%, Developer는 15%의 특별보너스를 지급*/
		System.out.println("이름\t 급여\t\t정규보너스\t특별보너스");
		System.out.println("=========================================");
		for(Employee ob : em){
			  if(ob instanceof Engineer) {
				  System.out.println(ob.toString() + "\t" + (int)(ob.salary*0.13));
			  } else if(ob instanceof Developer) {
				  System.out.println(ob.toString() + "\t" + (int)(ob.salary*0.15));
				  
			  }
		}
	}
}















