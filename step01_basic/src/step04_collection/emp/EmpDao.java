package step04_collection.emp;

import java.util.ArrayList;
import java.util.List;

//데이타베이스에서 자원을 가져올 용도로 사용됨(DAO: Data Access Object)
public class EmpDao {
	List<EmpVo> list=null;
	
	public EmpDao(){
		list=new ArrayList<>();
		list.add(new EmpVo("kim","영업부",1000000));
		list.add(new EmpVo("lee","개발부",1500000));
		list.add(new EmpVo("park","관리부",3000000));
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








