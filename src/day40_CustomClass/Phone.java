package day40_CustomClass;

public class Phone  {
	/*
	 * Create class Phone
	 * add few instance variable to define attribute/properties/state of object
	 * type as String, OS Sting, capacity as int
	 * add few methods:
	 * ring--> accept no parem, return no valu, just print "ringing"
	 * dial--> accept one param number as Long, print "dialing number"
	 * 
	 * 
	 * OPTIONAL: 
	 * add a behavior to Phone object
	 *  displayPhoneInfo method accept no param return no value
	 *  ---> this should print all phone attributes
	 *  
	 *  Create another class called PhoneFactory with main method
	 *  Create three diff. phone object, iphone, sumsung, pixel
	 *  * assign value for all attributes
	 *  and call methods
	 *  
	 */
	
	String brand;
	String OS;
	int capacity;
	
	public void ring () {
		System.out.println("ringing");
	}
	
	public void dial (Long num) {
		System.out.println("dialing "+num);
	}
	
	public void displayPhoneInfo () {
		System.out.println("Brand: "+brand +", OS: "+OS+ ", Capacity: "+capacity);
	}

}
