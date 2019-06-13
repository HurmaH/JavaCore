package day42_CustomClassReview;

import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(); 
	    e1.name="Abdul";
	    e1.age=100;
	    e1.title="Project Manager";
	    e1.salary=120000.01;
	    e1.printAllInfo();
	    
	    Employee e2 = new Employee(); 
	    e2.age = 23;
	    e2.name = "Makintosh";
	    e2.salary=99000.0;
	    e2.title = "Dev";
	    e2.printAllInfo();  
	    
	    Employee e3 = new Employee(); 
	    e3.name="Mavlida";
	    e3.age=28;
	    e3.title="Senior QA";
	    e3.salary=100000;
	    e3.printAllInfo();
	    
	    Employee e4=new Employee();
	    e4.name="Enser";
	    e4.age=24;
	    e4.title="CEO";
	    e4.salary=3000000;
	    e4.printAllInfo();
	    
	    //Creating list of Employee
	    ArrayList <Employee> myPeople = new ArrayList<>();
	    myPeople.add(e1);
	    myPeople.add(e2);
	    myPeople.add(e3);
	    myPeople.add(e4);
	    myPeople.add(new Employee());
	    
	    System.out.println("myPeople length: "+myPeople.size());
	   
	    Employee fifthObject = myPeople.get(4);
	    fifthObject.printAllInfo(); // will print default values fornew Employee() object
	    
	    //printinting all objects in myPeople list
	    
	    for (int i=0; i<myPeople.size(); i++) {
	    	System.out.println("Employee "+(i+1)+":");
	    	myPeople.get(i).printAllInfo();
	    }
	    
	    System.out.println("===TASK===");
	    
	    //print out employee that make more than 100K
	    //count employee younger than 30
	    
	    int countYoung =0 ;
	    String names="";
	    
	    for (int i=0; i<myPeople.size(); i++) {
	    	Employee each = myPeople.get(i);
	    	
	    	if (each.salary>=100000) {
	    		each.printAllInfo();
	    	}
	    	
	    	if (each.age<30) {
	    		countYoung++;
	    	}
	    	
	    	if (each.age>25) {
	    		names+=each.name+" | ";
	    	}
	    	
	    }
	    
	    System.out.println("Count of employees younger than 30: "+countYoung);
	    System.out.println("Name of employees older than 25: "+ names);
	    
	    System.out.println("----Raise the Salary of Employee who is younger than 100 by 20 K--- ");
	    
	    for (int i=0; i<myPeople.size(); i++) {
	    	Employee each = myPeople.get(i);
	        
	        if (each.name!=null && each.age < 100) {
	          
	          each.salary += 20000; 
	          each.printAllInfo();
	        }
	    }
	
	
	}

}
