package step02_method.constructorex;

/*
 Ŭ������ : UserInfo
+name:String   
+addr:String

+UserInfo()
+UserInfo(name:String, addr:String)   
+getter

*/
class UserInfo{
	public String name;
	public String addr;
	
	public UserInfo() {
		super();
		System.out.println("**�ּҷ�**");
	}
	public UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
}
public class ConstructorEx3 {
	public static void main(String[] args) {
		UserInfo ob=new UserInfo("���󿡸�","���� ���ʱ� �����͹̳� 150");
		System.out.println("�̸�:" + ob.getName());
		System.out.println("�ּ�:" + ob.getAddr());
	}
}
/* [��� ȭ��] 
 *   ** �ּҷ� **          <---����Ʈ �����ڿ��� ���
 *  �̸� : ���󿡸�                  <---main()�Լ����� getter�� �̿��ؼ� ���
 *  �ּ� : ���� ���ʱ� �����͹̳� 150
 */




