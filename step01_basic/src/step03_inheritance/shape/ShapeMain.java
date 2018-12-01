package step03_inheritance.shape;

public class ShapeMain {
	public static void main(String[] args) {
		Shape ob=new Rectangle(4,5);
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ="+ob.getSize());    
		
		ob=new Triangle(3,7);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ="+ob.getSize());    
		
/*		Rectangle rr=new Rectangle(4,5);
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ="+rr.getSize());    //20
		
		Triangle tt=new Triangle(3,7);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ="+tt.getSize());    //10.5
*/	
	}
}
