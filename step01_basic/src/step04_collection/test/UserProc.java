package step04_collection.test;

//����Ÿ���̽� ����(����Ͻ����� ó��)
public class UserProc {
	
	/*
	 *   getLoginUser �޼��带 ����ÿ�
	 *   
	 *   �Ű������� ���� pororo�� 1234�� ���Ͽ�
	 *   ������  entity ��ü�� �����  ==> User entity=new User();
	 *   setter�� ���� id, pw, "�Ƿη�", 89.97�� �����Ͻÿ�
	 *   
	 *   entity�� �����Ͻÿ�
	 */
	public User getLoginUser(String id, String pw){
		User entity=null;
		if(id.equals("pororo") && pw.equals("1234")){
			entity=new User();
			
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("�Ƿη�");
			entity.setPoint(89.97);
		}
		return entity;
	}	
}








