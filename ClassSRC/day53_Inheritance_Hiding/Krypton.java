package day53_Inheritance_Hiding;

public class Krypton extends Planet{
	public static void main(String[] args) {
		
	}
	
	@Override//valid OVerride
	public void rotate() {
		System.out.println("Super man's planet rotating");
	}	
	
	//new method Overload of method inherited rotate method from super class
	//It is nor Overriden Method
	public void rotate(String x) {
	System.out.println("Rotating ddddd");
}
	
	//Inherited methods:
	
	//--->Not Valid Override Method because of return type
//	public void rotate() {
//	System.out.println("Rotating");
//}
	
	//--->Not Valid Override Method because of less visibility access
//	protected void rotate() {
//		System.out.println("Rotating");
//	}
	
    //--->Not Valid Override Method because Static method cannot hide instance method from Super class
//	public static void rotate() {
//		System.out.println("Super man's planet rotating");
//	}
	
	
	//--->Not Valid Override Method because Instance method cannot Override static method
//	public  int rotate(int d, int y) {
//		System.out.println("Rotating ddddd with return");
//		return 5;
//	}
	
//	public void rotate(int d) {
//		System.out.println("Rotating ddddd");
//	}
	


}
