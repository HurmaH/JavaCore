package day25NestedLoopArray;

public class CanvasPractice {
	public static void main(String[] args) {
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 	
	
	//use abobe arrays to generate below messages:
	
	//1.the course id for <courses> is <id>
	for (int i=0; i<courses.length; i++) {
		System.out.println("the course id for <"+courses[i]+"> is <"+courseId[i]+">");
	}
	
	//2. find out the ID of "Online-Java Programming"
	for(int i=0; i<courses.length; i++) {
		if (courses[i].equalsIgnoreCase("Online-Java Programming")) {
			System.out.println("The ID of \"Online-Java Programming\" is:"+courseId[i]);
		}
	}
	
	//3.find out the course name of 203
	for(int i=0; i<courseId.length; i++) {
		if (courseId[i]==203) {
			System.out.println("the course name of 203 "+courses[i]);
		}
	}
	
	//4.find the course contains Software and count
	int count=0;
	for(int i=0; i<courses.length; i++) {
		if (courses[i].contains("Software")) {
			System.out.println("the course contains Software: "+courses[i]);
			count++;
		}
	}
	
	
	}

}
