package step04_collection.emp;

import java.util.ArrayList;
import java.util.List;

//����Ÿ���̽����� �ڿ��� ������ �뵵�� ����(DAO: Data Access Object)
public class EmpDao {
	List<EmpVo> list=null;
	
	public EmpDao(){
		list=new ArrayList<>();
		list.add(new EmpVo("kim","������",1000000));
		list.add(new EmpVo("lee","���ߺ�",1500000));
		list.add(new EmpVo("park","������",3000000));
	}
	public List<EmpVo> getList() {
		return list;
	}
	
	public EmpVo getEmp(String ename) {
		for(EmpVo ob : list) {
			if(ob.getEname().equals(ename)) {
				return ob;
			}
		}
		return null;
	}
}








