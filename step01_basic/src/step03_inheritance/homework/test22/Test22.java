package step03_inheritance.homework.test22;
/*
 [����22] ���� ���α׷��� �ϼ��Ͻÿ�
(1)Entry
   -word:String 
   +Entry()                               ==>  ***������***  ���
   +Entry(word:String)            ==>  Entry()ȣ�� 
   +writeView():void                ==>  ������

(2)SubEntry   ==> Entry�� ��ӹ���
   -definition:String  
   -year:int
   +SubEntry()
   +SubEntry(word:String)                                              ==> Entry(String word)   ȣ�� 
   +SubEntry(word:String, definition:String, year:int)   ==> SubEntry(String word)ȣ��
   +printView():void                                                         ==> ����, �ñ����

(3)main()�Լ�����
    SubEntry ob=new SubEntry("OOP","Object Oriented Programming", 1991);
    ob.writeView();
    ob.printView();

(4)���

*****������******
��� : OOP
���� : Object Oriented Programming
�ñ� : 1991��
 */
public class Test22 {

}
