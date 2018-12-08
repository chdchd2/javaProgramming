package step04_collection.test;

//데이타베이스 연동(비즈니스로직 처리)
public class UserProc {
	
	/*
	 *   getLoginUser 메서드를 만드시오
	 *   
	 *   매개변수로 들어온 pororo와 1234를 비교하여
	 *   맞으면  entity 객체를 만들어  ==> User entity=new User();
	 *   setter를 통해 id, pw, "뽀로로", 89.97를 대입하시오
	 *   
	 *   entity를 리턴하시오
	 */
	public User getLoginUser(String id, String pw){
		User entity=null;
		if(id.equals("pororo") && pw.equals("1234")){
			entity=new User();
			
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("뽀로로");
			entity.setPoint(89.97);
		}
		return entity;
	}	
}








