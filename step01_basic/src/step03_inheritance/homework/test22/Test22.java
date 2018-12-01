package step03_inheritance.homework.test22;
/*
 [문제22] 다음 프로그램을 완성하시오
(1)Entry
   -word:String 
   +Entry()                               ==>  ***약어사전***  출력
   +Entry(word:String)            ==>  Entry()호출 
   +writeView():void                ==>  약어출력

(2)SubEntry   ==> Entry를 상속받음
   -definition:String  
   -year:int
   +SubEntry()
   +SubEntry(word:String)                                              ==> Entry(String word)   호출 
   +SubEntry(word:String, definition:String, year:int)   ==> SubEntry(String word)호출
   +printView():void                                                         ==> 원어, 시기출력

(3)main()함수에서
    SubEntry ob=new SubEntry("OOP","Object Oriented Programming", 1991);
    ob.writeView();
    ob.printView();

(4)출력

*****약어사전******
약어 : OOP
원어 : Object Oriented Programming
시기 : 1991년
 */
public class Test22 {

}
