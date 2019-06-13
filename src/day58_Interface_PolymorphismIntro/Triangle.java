package day58_Interface_PolymorphismIntro;

public class Triangle extends Shape {
	//String color
	int height;
	int base;
	
	
	public Triangle(String color, int height, int base) {
		this.color = color;
		this.height = height;
		this.base = base;
		
	}
//	public static void main(String[] args) {
//
//		Triangle t1 = new Triangle("red", 10, 5);
//		System.out.println(t1.calculateArea());
//		t1.draw();
//		t1.drawLine(3);
//
//		Square s1 = new Square("Blue", 7);
//		System.out.println(s1.calculateArea());
//
//		s1.draw();
//		s1.drawLine(4);
//		
//		System.out.println( DRAWING_TOOL  );
//		Drawable.printDrawingTool();
//		
//	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
		
	}

	@Override
	public String toString() {
		return "Triangle [height=" + height + ", base=" + base + "]";
	}

	@Override
	public double calculateArea() {
		return height*base/2;
	}

}
