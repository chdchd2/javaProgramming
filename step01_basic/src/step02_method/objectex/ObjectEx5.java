package step02_method.objectex;

/*   클래스명 : Sales
 *   -item:String
 *   -qty:int
 *   -cost:int
 *   
 *   +setItem(item String):void
 *   +setQty(qty int):void
 *   +setCost(cost int):void
 *   +getItem():String
 *   +getQty():int
 *   +getCost():int
 *   +toString():String         ==> 출력
 *   +getPrice():int             ==> 수량 * 단가를 리턴
 */
class Sales{
	private String item;
	private int qty;
	private int cost;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "품목 : " + item +"\n수량 : " + qty + "개\n단가 : "+ cost + "원\n금액 : " + getPrice() + "원";
	}
	public int getPrice(){
		return qty * cost;
	}
}
public class ObjectEx5 {
	public static void main(String[] args) {
		//Sales객체 ob를 만들어서 setter를 통해 데이터를 넣으시오
		Sales ob = new Sales();		
		ob.setItem("apple");
		ob.setQty(5);
		ob.setCost(1200);
		
		//[문제1] toString()으로 출력하시오
		System.out.println(ob.toString());
		
		//[문제2]getter를 이용해서 출력하시오
		System.out.println(ob.getItem() +"  " + ob.getCost() + "원짜리 "
				                  + ob.getQty() +"개 구입하면 " + ob.getPrice() +"원이 필요함");
	}
}
/*  
* [문제1]
*품목 : apple
*수량 : 5
*단가 : 1200원
*금액 : 6000원
*
*[문제2]
*apple   1200원 짜리 5개 구입하면 6000원이 필요함
*/






