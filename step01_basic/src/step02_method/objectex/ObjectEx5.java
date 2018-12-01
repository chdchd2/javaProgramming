package step02_method.objectex;

/*   Ŭ������ : Sales
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
 *   +toString():String         ==> ���
 *   +getPrice():int             ==> ���� * �ܰ��� ����
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
		return "ǰ�� : " + item +"\n���� : " + qty + "��\n�ܰ� : "+ cost + "��\n�ݾ� : " + getPrice() + "��";
	}
	public int getPrice(){
		return qty * cost;
	}
}
public class ObjectEx5 {
	public static void main(String[] args) {
		//Sales��ü ob�� ���� setter�� ���� �����͸� �����ÿ�
		Sales ob = new Sales();		
		ob.setItem("apple");
		ob.setQty(5);
		ob.setCost(1200);
		
		//[����1] toString()���� ����Ͻÿ�
		System.out.println(ob.toString());
		
		//[����2]getter�� �̿��ؼ� ����Ͻÿ�
		System.out.println(ob.getItem() +"  " + ob.getCost() + "��¥�� "
				                  + ob.getQty() +"�� �����ϸ� " + ob.getPrice() +"���� �ʿ���");
	}
}
/*  
* [����1]
*ǰ�� : apple
*���� : 5
*�ܰ� : 1200��
*�ݾ� : 6000��
*
*[����2]
*apple   1200�� ¥�� 5�� �����ϸ� 6000���� �ʿ���
*/






