package Interview;

public class FlyingCarTest {
	public static void main(String[] args) {
		
		FlyingCars car1 = FlyingCars.getInstance();
		System.out.println(car1);
		
		FlyingCars car2 = FlyingCars.getInstance();
		System.out.println(car2);
	}

}
