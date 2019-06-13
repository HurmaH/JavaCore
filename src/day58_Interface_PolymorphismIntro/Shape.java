package day58_Interface_PolymorphismIntro;

public abstract class Shape implements Drawable{
	
	String color;
	
	public abstract double calculateArea();
	public abstract String toString();
	
	//inherited members: all except static:
	/*
	public abstract void draw();
	
	public default void drawLine(int num) {
		System.out.println("Drawing "+num+" line");
	}
	 */
	
	public static void main(String[] args) {
		System.out.println(Shape.DRAWING_TOOL);
		System.out.println(Drawable.DRAWING_TOOL);
		System.out.println(DRAWING_TOOL);
		
		Drawable.printDrawingTool();//calling staticly static method
	}

}
