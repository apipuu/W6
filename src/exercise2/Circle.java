package exercise2;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		radius=1.0;
	}
	
	public Circle(double radius) {
		super();
		this.radius=radius;
	}
	
	public Circle(double radius, String color, Boolean filled ) {
		super(color,filled);
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.pow(this.radius,2)*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	public String toString() {
		return "A Circle with radius " + this.radius + " which is subclass of " + super.toString();
	}
}
