package step04_collection.instanceofEx;

class AA{
	
}
class BB extends AA{
	
}
class CC extends AA{
	
}

public class InstanceofEx1 {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		
		System.out.println(b instanceof AA);
		System.out.println(a instanceof CC);
		//System.out.println(b instanceof CC); //error

	}

}
