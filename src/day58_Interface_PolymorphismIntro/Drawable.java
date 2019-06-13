package day58_Interface_PolymorphismIntro;

public interface Drawable {
	public static final String DRAWING_TOOL="pencil";
	
	// must be implemented in first concrete class
	public abstract void draw();
	
	// can be used as is or being overriden
	public default void drawLine(int num) {
		System.out.println("Drawing "+num+" line");
	}
	
	// only way to use static method of interface is the static way 
	// it is not inherited 
	// this behavior is exclusive to interface 
	// class's static methods are inherited to sub class
	public static void printDrawingTool () {
		System.out.println("My tool is "+DRAWING_TOOL);
	}
	
	
}


