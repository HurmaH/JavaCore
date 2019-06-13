package day47_StaticKey;

import java.util.ArrayList;
import java.util.Arrays;

public class BikeTest {
	public static void main(String[] args) {
		
		Bike b1 = new Bike ("Santa Cruz", 10, 20);
		Bike b2 = new Bike ("Trek", 5, 40);
		Bike b3 = new Bike ("Yamaha", 4, 50);
		Bike b4 = new Bike ("Sputnik", 2, 25);
		
		ArrayList <Bike> bikeList = new ArrayList <>(Arrays.asList(b1,b2,b3,b4));
		
		for (int i=0; i<bikeList.size(); i++) {
			System.out.println(bikeList.get(i));
		}
		
		System.out.println("----------------");
		for (Bike each:bikeList) {
			System.out.println(each.getId()+"---"+each.getBrand());
			each.speedUp(10);
			System.out.println(each);//each.toString
		}
		
		System.out.println("-----------------");
		Bike.showCurrentCount(); //Bike count is 4
		
		Bike.resetCount();
		Bike.showCurrentCount(); //Bike count is 0
		
		Bike b5 = new Bike ("Yamaha", 4, 88);
		System.out.println("Current id of b5: "+b5.getId());
		
		Bike b6 = new Bike("Harley-Davidson", 3, 70);  
		System.out.println("current id of b6 is " + b6.getId());
		Bike.showCurrentCount(); //-->> Bike count is 4 now
	}

}
