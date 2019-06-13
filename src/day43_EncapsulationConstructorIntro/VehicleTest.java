package day43_EncapsulationConstructorIntro;

import day39_CustomClassIntro.Car;

public class VehicleTest {
	
	public static void main(String[] args) {
		Vehicle car1 = new Vehicle();
		car1.setMake ("Tesla");
		car1.setModel ("Model X");
		car1.setYear(2016);
		car1.setSpeed(100);
		
		System.out.println(car1.getMake());
	    System.out.println(car1.getModel());
	    
		car1.increaseSpeed(10);
		car1.decreaseSpeed(20);
		
//SECOND OBJECT----------------------------------------------
		
		 Vehicle car2 = new Vehicle();
		 car2.setMake ("BMW");
	     car2.setModel ("M6");
		 car2.setSpeed(10);
		 
		 System.out.println(car2.getMake());
		 System.out.println(car2.getModel());
		    
	     car2.increaseSpeed(10);
		 car2.decreaseSpeed(20);
		
	}

}
