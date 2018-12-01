package step03_inheritance.inheritance;

public class UserEx3 {

	public static void main(String[] args) {
		
		User[] ob = new User[] {
				 new User("kim", "010-111-1234"),
				 new User("lee", "010-222-1234"),
				 new User("park", "010-333-1234")
		};
		
		for(User m:ob) {
			System.out.println(m.getName()+" "+m.getPhone());
		}
	}

}
