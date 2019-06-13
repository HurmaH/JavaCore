package day46_StaticInitializerBlocks;

public class CyberHouseTest {
	
	public static void main(String[] args) {
		
		CyberHouse h1 = new CyberHouse (1, "Victorian");
		CyberHouse h2 = new CyberHouse (2, "Gara Oy");
		
		//accessing static variable
		//we access static members using static way
		//className.staticFieldName
		//className.staticMethodName (args...)
		
		//CyberHouse.neighbourHood="Cybertek Corner"; -->> we will give value to static veriable
		System.out.println(CyberHouse.neighbourHood);
		
		System.out.println(h1.houseNumber);
		System.out.println(h2.houseNumber);
		h1.houseNumber=100;
		 // changing instance variable value of object 
	    // does not affect another object 
		System.out.println(h2.houseNumber);//not affected by change of h1
		
		//can we use object to access static variable - YES, but not recommended
		//even though it's recommended to use static way
		//and it is className.staticVariable
		
		System.out.println(h1.neighbourHood);
		System.out.println(h2.neighbourHood);
		h1.neighbourHood = "Cyber Tower";
		// changing static variable value of object 
	    // affect another object
		System.out.println(h2.neighbourHood);
	}

}
