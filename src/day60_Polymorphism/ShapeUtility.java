package day60_Polymorphism;
import day58_Interface_PolymorphismIntro.*; //importing day58 package
public class ShapeUtility {
	
	public static void main(String[] args) {
		describeTheShape ( new Triangle ("Blue", 12, 6));//it will choose exact matching overloaded method Triangle one
		
		Shape s1 = new Triangle ("Red", 15, 10);//because passing referance type it will choose Shape one
		describeTheShape(s1);
				
		describeTheShape ( new Square ("Blue", 12));//there is no exact math o it will go to more general Overload Shape one
		
		// something ridiculous but focus on concept itself 
	    describeTheShape( new Dog() );
	    
	    
		//implementing static and non static Object retrning Methods
		
		Shape myShape = getAnyShape();// Shape myShape = new Square ("blue", 10);
		myShape.draw();//will call the one in Square
		
		ShapeUtility s = new ShapeUtility();//non static method needs object
		Drawable myDrawable = s.getAndDrawable(); 
	    myDrawable.drawLine(2);
	}
	
 	//staic method returning Shape
	public static Shape getAnyShape() {
		Shape s1 =new Square ("blue", 10);
		return s1; 	//return new Square ("blue", 10);
	}
	
	//nonstatic method returning Drwabl object
	public Drawable getAndDrawable() {
		Drawable d1 = new Triangle("Red",120, 100) ; 
	    return d1; 
	    
	    // return new Triangle("Red",120, 100)
	}
	//we dont want to create object while calling this
	//utility methods we just made it static
	public static void describeTheShape ( Shape anyShape) {
		System.out.println("Calling describeTheShape (Shape anyShape)");
		anyShape.draw();
	}
	
	//create another method that accepts only Triangle object
	public static void describeTheShape (Triangle anyTriangle) {
		System.out.println("Calling describeTheShape (Triangle anyTriangle)");
		anyTriangle.draw();
	}
	
	// do not get fooled by the name 
	  // it accept any type of Object 
	  public static void describeTheShape(Object anyObject) {  
	    System.out.println("calling describeTheShape(Object anyObject))");
//	    anyObject.draw();      -->gives error
//	    anyObject.makeNoise(); -->gives error
	  }
	  
	
	

}
