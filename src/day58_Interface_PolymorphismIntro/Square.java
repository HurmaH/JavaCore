package day58_Interface_PolymorphismIntro;

public class Square extends Shape{
	
	int sideLength;
	
	public Square(String color,int sizeLength) {
		this.color = color; 
		this.sideLength = sizeLength;
	}
	
	// we did not have to override this 
	// since it already has the body in interface 
	// we chose to override to provide our own implementation
	@Override
	public void drawLine(int n) {
			System.out.println("drawing square using 4 line");
			System.out.println("drawing " + n + "times ");
	}
	
	// below methods are implementation of abstract methods 
	// inherited from super class 
	@Override
	public void draw() {
			System.out.println("draw SQUARE");

	}
	
	// this is how we calculate are of square
	@Override
	public double calculateArea() {
		return sideLength*sideLength;
	}

	@Override
	public String toString() {
		return "Square [sideLength=" + sideLength + ", color=" + color + "]";
	}

}
