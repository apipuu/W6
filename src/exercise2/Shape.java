package exercise2;

public class Shape {
	private Boolean filled;
	private String color;
	
	 public Shape() { // 1st (default) constructor
	 this.filled = true;
	 this.color = "green";
	 }
	 
	 public Shape(String color, Boolean filled) { // 1st (default) constructor
	 this.filled = filled;
	 this.color = color;
	 }
	 
	public Boolean isFilled() {
		return filled;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		String fill=this.filled?"Filled":"not Filled";
		return "A Shape with Color of " + this.color + " and " + fill;
	}
}
