package exercise2;

public class square extends Rectangle{
	public square() {
		super();
	}
	public square(double side) {
		super(side,side);
	}
	public square(double side, String color, boolean filled) {
		super(side,side,color,filled);
	}
	public String toString() {
		return "A square with side = " + super.getWidth() + ", which is a subclass of " + super.toString();
	}
	public double getSide() {
		return super.getLength();
	}
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	public void setWidth(double side) {
		this.setSide(side);
	}
	public void setLength(double side) {
		this.setSide(side);
	}
}
