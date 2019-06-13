package day44_Constructor;

import java.util.ArrayList;
import java.util.List;

public class DreamJobTest {
	public static void main(String[] args) {
		DreamJob j1= new DreamJob();
		DreamJob j2= new DreamJob("Senior Sdet");
		DreamJob j3= new DreamJob("Scrum Master","Oracle",130000);
		DreamJob j4= new DreamJob("Sdet","Santander",125000);
		DreamJob j5= new DreamJob("Tester", "Google", 100000.0);  
		DreamJob j6= new DreamJob("Programmer", "Apple", 2000000);
		
		System.out.println(j1.getAnnualSalary());//0.0
		System.out.println(j1.getTitle()); //undifined
		
		System.out.println();
		System.out.println("----toString Method----");
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		System.out.println(j4.toString());
		System.out.println(j5.toString());
		System.out.println(j6.toString());
		
		// if we print out any reference variable 
		// or any object directly 			
		// it will by default call toString()
		System.out.println(j6);
		
		List <DreamJob> jobList = new ArrayList <>();
		jobList.add(j1);
		jobList.add(j2);
		jobList.add(j3);
		jobList.add(j4);
		jobList.add(j5);
		jobList.add(new DreamJob("Programmer", "Apple", 2000000));//same as jobList.add(j6);
		
		System.out.println("---Print directly jobList object---");
		System.out.println(jobList);//we will not get hashcode because of toString method
		
		System.out.println(jobList.get(0));//will return whatever returns toString method
		
		System.out.println("---Printing Object using loop---");
		for(DreamJob job:jobList) {
			System.out.println(job);
		}
	}

}
