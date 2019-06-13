package day39_CustomClassIntro;

public class Garage {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.make ="Tesla";
		car1.model="Model X";
		car1.year = 2016;
		car1.horsePower = 259;
		
		System.out.println(car1.model );
	    System.out.println(car1.make );
	    System.out.println(car1.year );
	    System.out.println(car1.price );
	    System.out.println(car1.horsePower );
	    System.out.println(car1.isConvertable );
	    
	    
	    //Default values for fields if it is not defined
	    Car car2 = new Car();
	    
	    System.out.println(car2.model );
	    System.out.println(car2.make );
	    System.out.println(car2.year );
	    System.out.println(car2.price );
	    System.out.println(car2.horsePower );
	    System.out.println(car2.isConvertable );
	}

}
