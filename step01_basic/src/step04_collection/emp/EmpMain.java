package step04_collection.emp;

import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		EmpDao dao=new EmpDao();
		System.out.println("** ��� ��� ����ϱ� **");
		
		List<EmpVo> list = dao.getList();
		
		for (EmpVo ob : list) {
			System.out.println("�̸� : " + ob.getEname() + "\t�μ� : " + ob.getDept() + "\t�޿� : " + ob.getSalary());
			
		}

		//------------------------------------------------------------------------
		System.out.println("*** lee ��� ����ϱ� ***");
		
		EmpVo entity = dao.getEmp("lee");
		
		if (entity == null) {
			System.out.println("ã�� ��� ����");
		} else {
			System.out.println(entity.getEname() + " " + entity.getDept() + " " + entity.getSalary());
		}
		
	}
}
/*
***��� ��� ����ϱ�***
�̸� : kim
�μ� : ������
�޿� : 1000000

�̸� : lee
�μ� : ���ߺ�
�޿� : 1500000

�̸� : park
�μ� : ������
�޿� : 3000000
============================
** lee��� ����ϱ�**
lee  ���ߺ�  1500000
*/













