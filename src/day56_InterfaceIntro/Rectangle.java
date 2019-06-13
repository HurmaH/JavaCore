package day56_InterfaceIntro;

public class Rectangle extends Shape{
	
//	protected instance fields   width , height
	protected int width;
	protected int height;
	public Rectangle(String color, int width, int height) { //	3 args constructor to set the field values 
		super(color);
		this.width = width;
		this.height = height;
	}
	
public static void main(String[] args) {
	
	Circle c1 = new Circle("white", 2);//1 Circle 
	System.out.println(c1);
	c1.calculatePerimeter();
	System.out.println(c1.calculateArea());
	    
	Rectangle r1 = new Rectangle("blue", 5, 10);//1 Rectangle object 
    r1.calculatePerimeter();
    System.out.println(r1.calculateArea()   );
    System.out.println(r1);
    
} 

//	implement abstract methods from super class 
     @Override
    public void calculatePerimeter() {
    	System.out.println("Perimeter is: "+(2*width*2*height));;
    }
     
     @Override
    public double calculateArea() {
    	double area = width*height;
    	return area;
    }

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}
     
     


}

