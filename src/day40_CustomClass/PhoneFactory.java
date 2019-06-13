package day40_CustomClass;

public class PhoneFactory {
	/*  Create another class called PhoneFactory with main method
	 *  Create three diff. phone object, iphone, sumsung, pixel
	 *  * assign value for all attributes
	 *  and call methods
	 */
	
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.brand = "Apple";
		p1.OS = "IOS";
		p1.capacity= 64;
		p1.dial(234568932L);
		p1.ring();
		System.out.println(p1.brand);
		
		Phone p2 = new Phone();
		p2.brand = "Samsung";
		p2.OS = "Android";
		p2.capacity= 32;
		p2.dial(234568932L);
		p2.ring();
		System.out.println(p2.brand);
		
		Phone p3 = new Phone();
		p3.brand = "Google";
		p3.OS = "Google OS";
		p3.capacity= 16;
		p3.dial(234568932L);
		p3.ring();
		System.out.println(p3.brand);
		p3.displayPhoneInfo();
		}

}
