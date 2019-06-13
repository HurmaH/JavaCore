package day50.difPackage;

import day50_inheritance.Vehicle;

public class Airplane extends Vehicle {
	private int wingCount;
	
	  public static void main(String[] args) {
		    
		    Airplane a1 = new Airplane("Boeing", "737", 2020, 4); 
		    System.out.println(a1);
		    System.out.println(a1.year);
		    
	  }
	public Airplane(String brand, String model, int year, int wingCount) {
		super(brand, model, year);
//		this.brand = brand;
//		this.model = model;
//		this.year = year;
		this.wingCount=wingCount;
	}

	public int getWingCount() {
		return wingCount;
	}

	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}

	@Override
	public String toString() {
		return "Airplane [wingCount=" + wingCount 
				+ ", year=" + year 
				+ ", brand=" + getBrand() 
				+ ", model="+ getModel() + "]";
	}

	

	
	
	

}
