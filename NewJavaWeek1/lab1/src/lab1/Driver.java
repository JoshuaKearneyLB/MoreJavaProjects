package lab1;

public class Driver {
	public static void main(String args[]) {
		
		Rectangle Rectangle1 = new Rectangle(4, 3);
		System.out.println(Rectangle1.getArea());
			
		
		Rectangle Rectangle2 = new Rectangle(4, 3);
		System.out.println(Rectangle1.getArea());
		Rectangle2.setHeight(100);
		System.out.println(Rectangle2.getArea());
		
		Ellipse ellipse1 = new Ellipse(3, 5);
		System.out.println(ellipse1.getArea());
		
		
		
	}
}
