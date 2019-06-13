package day47_StaticKey;

public class Course {
	
	public static String school;//="Cybertek School";
	public static boolean isRamadan;
	int courseId;
	
	public Course () {
		System.out.println("Constructor");
	}
	//static initilizer block
	//it's used to initilize the static fields value before
	//the type's first usage
	//and it will run only one time
	//we can create more than one static block initializer
	//it will run according to order from top to bottom
	
	static {
		school="Cybertek School";
		isRamadan = true;
//      if instamce field is going to be used inside static block need to create object 
//		Course c1 = new Course ();
//		c1.courseId = 2;
		System.out.println("WELCOME TO OUR SCHOOL");
		System.out.println("Let The Journey Begin");
		
		if (isRamadan) {
			System.out.println("Use ramadan schedule");
		}else {
			System.out.println("Use normal schedule");
		}
	}

}
