package day47_StaticKey;

public class Bike {
	
	private String brand;
	private int gear;
	private int speed;
	private int id;
	
	public static int countOfBike;
	
//	create private no arg constructor  
//	print out no arg is being called	
	private Bike() {
		//System.out.println("no arg called");
		countOfBike++;
    	this.id +=countOfBike;
	}
	
//	provide getters for all instance fields 
//	privide setters for brand, gear, speed
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}
	
//	create 3 args constructors 
//	to set brand, gear, speed
//	and keep the count of objects here
//	call your no arg constructor in here	
//	set the id value by the count of object to stimulate incremented
	public Bike(String brand, int gear, int speed) {
		this();
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
//		countOfBike++;
//		this.id +=countOfBike;
	}
	
	public static void resetCount() {
		countOfBike=0;
	}

		
//	create instance methods
//	speedUp : accept one increaseBy as int 
//	return nothing , it will increase current speed by the amount provided
	public void speedUp(int increaseBy) {
		this.speed += increaseBy;
	}
	

//	slowDown : accept one decreaseBy as int 
//	return nothing , it will decrease current speed by the amount provided
	public void slowDown(int decreaseBy) {
		this.speed -= decreaseBy;
	}
	
//	toString method as usual
	public String toString() {
		return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
	}
	
public static void showCurrentCount() {
	System.out.println("Current Count of Bike: "+countOfBike);
}
	
	


}
