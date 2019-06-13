package day47_StaticKey;

public class CourseTest {
	
	public static void main(String[] args) {
	
	System.out.println("Hello World"); //will not run static block because it did not use Course	
	
	//first action will be static block when type is used
	
	Course c1 = new Course(); //static block will be initilized once
	
	System.out.println(Course.school);
		System.out.println(Course.school);//static block will not be initilized
		System.out.println(Course.isRamadan);
		
		
//		Course c1 = new Course ();
//		System.out.println(c1.courseId);
	
	
	
	//System.out.println(courseId); --->>cannot make static reference to non-static field
	
		
	}

}
