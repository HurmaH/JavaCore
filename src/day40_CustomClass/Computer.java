package day40_CustomClass;

public class Computer {
	/* 
	 * instance variables/field get default value 
	 * if it's not specified in template class
	 * 
	 * default values can be changed 
	 * in template class by providing value
	 * in template class itself while declaring the field
	 * 
	 */
	
	String type="unknown";//changing default value from null to "unknown"
	int ram;
	double screenSize;
	String color;
	String OS;
	boolean isPersonal;
	
	//it ;s highly not recommended to have main method directly
	//inside your template class--> use different class to create object
	public static void main(String[] args) {
		
		Computer iMac = new Computer();
		//System.out.println(type); //we cannot access instance variable outside of instance method
		System.out.println(iMac.type); //we had to creat object to pass instance field,
	}
	

}
