package lab1;



abstract class Shape {
	
	protected int sides;
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	abstract public double getArea();
	
	public Shape(int sides){
		this.sides = sides;
	}
	
}


class Rectangle extends Shape {
	
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		super(4);
		this.height = height;
		this.width = width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int geHeight() {
		return this.height;
	}
		
	public int getWidth() {
		return this.width;
	}
	
	
	@Override
	public double getArea() {
		return (this.width * this .height);
	}

}
	

class Circle extends Shape {
	
	int radius;
	
	public Circle(int radius) {
		super(1);
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	@Override
	public double getArea() {
		return(this.radius * this.radius * Math.PI);
	}
}


class Ellipse extends Rectangle {
	
	Ellipse(int width, int height){
		super(width, height);
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		double a = height / 2;
		double b = width / 2;
		return (Math.PI * a * b);
	}
}


