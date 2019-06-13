package day59_Polymorphism;
import day58_Interface_PolymorphismIntro.*; //importing day58 package
// ONLY REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS USING THAT VARIABLE !!!
public class ShapeTest {
	public static void main(String[] args) {
// Given the classes we already created in day 58
    
    // Just like Create a reference variable called myIndoorPet as type IndoorPet
    // IndoorPet myIndoorPet = any indoorpet Object
    // Create a reference variable called myDrawable as type Drawable
    Drawable d1 = new Triangle ("Red", 12, 10 );
    d1.draw();//triangle version
    d1.drawLine(2);
                 
    // and try to assign all the objects you can assign 
     // and see what you can access 
    // and call all the methods you can call 
    d1 = new Square ("Yellow", 12);
    d1.draw();//triangle version
    d1.drawLine(2);
    
   System.out.println("----------------");
    // Create a Drawable array 
    // add few items 
    // and draw all of them 
   Drawable d0 = new Square("red",51);
   Drawable d2 = new Triangle("blue",15,5);
   Drawable d3 = new Triangle("red",25,5);
   Drawable d4 = new Square("Green",35);
  
Drawable[] allDrawables = {d0,d1,d2,d3, d4} ; 

for (Drawable each : allDrawables) {
 each.draw();
}

 
    
    // Also create a shape reference variable 
    // and assign few different objects and call their methods
    
    
    //Optionally 
	}
	

}
