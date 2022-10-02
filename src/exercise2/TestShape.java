package exercise2;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s1 = new square(5, "blue", true);
		Rectangle r1 = new Rectangle(6,8);
		Circle c1 = new Circle(7, "green", false);
		Shape s2 = new Shape();
		
		System.out.println(s1.toString());
		System.out.println(r1.toString());
		System.out.println(c1.toString());
		System.out.println(s2.toString());
	}

}
