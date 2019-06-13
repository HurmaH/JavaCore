package day56_InterfaceIntro;

public class Circle extends Shape {
		
		 double radius;
		 	 
		 public Circle(String color, double radius) {//2 args constructor to set the field values 
				super(color);
				this.radius = radius;
		}
		 
    //implement abstract methods from super class 
	@Override
	public void calculatePerimeter() {
		
		double p = 2*Math.PI*radius;
		System.out.println("Calculated Perimeter: " +p);	
	}
	
	@Override
	public double calculateArea() {
		double area = Math.PI*radius*radius;
		
	return area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius 
				+ ", color=" + color + "]";
	}
	
	



}
