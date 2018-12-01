package step03_inheritance.inheritance;

//오브젝트 배열
public class UserEx2 {

	public static void main(String[] args) {
		
		User[] ob = new User[3];
		
		ob[0] = new User("kim", "010-111-1234");
		ob[1] = new User("lee", "010-222-1234");
		ob[2] = new User("park", "010-333-1234");
		
		for(int i=0; i<ob.length; i++) {
			System.out.println(ob[i].getName()+" "+ob[i].getPhone());
		}
		
		
	}

}
