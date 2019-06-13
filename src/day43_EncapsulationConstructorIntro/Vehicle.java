package day43_EncapsulationConstructorIntro;

public class Vehicle {
//Create a class called Vehicle 
//with few private fields model , make , speed 
//create getters and setters for all those private fields 
//
//create methods : 
//	increaseSpeed : it accepts one parameter increaseBy as int 
//	and increase the speed to new speed. 
//	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->11->12->13->14->15->
//
//	decreaseSpeed  : 
//	it accepts one parameter decreaseBy as int 
//	and decrease the speed to new speed. 
//	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->9->8->7->6->5->

	private String model;
	private String make;
	private int year;
	private int speed;
	
	
	public String getModel () {
		return model;
	}
	public void setModel (String newModel) {
		this.model=newModel;  //this refers to private 
	}
	
	
	public String getMake() {
		return make;
	}
	public void setMake (String newMake) {
		this.make=newMake;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear (int newYear) {
		this.year=newYear;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed (int newSpeed) {
		this.speed=newSpeed;
	}
	
	public void stop() {
	    
//	    speed = 0 ;      // direct way
	    this.speed = 0 ; // using this keyword
//	    setSpeed(0);
//	    this.setSpeed(0);
	    
	    
	  }
	
	public void increaseSpeed (int increaseBy) { 
//Akbar's VERSION
		 for (int i = 1; i <= increaseBy; i++) {
		      speed++ ;
		      System.out.print(speed + "->");
		    }
		
		System.out.println();
//MY VERSION WILL NOT CHANGE ORIGINAL SPEED
//  	speed = getSpeed();             
//		for (int i=speed; i<=speed+increaseBy; i++) {
//			System.out.print(i+"->");
//		}
	}
	
	
    public void decreaseSpeed (int decreaseBy) {
//AKBAR's VERSION
		 for (int i = 1; i <= decreaseBy; i++) {
		      speed-- ;
		      System.out.print(speed + "->");
		    }
    	System.out.println();

//MY VERSION WILL NOT CHANGE ORIGINAL SPEED    	
//		speed = getSpeed();	
//		for (int i=speed; i>=speed-decreaseBy; i--) {
//			System.out.print(i+"->");
//		}
//		

	

	}
	
}
