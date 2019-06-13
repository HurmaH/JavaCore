package day46_StaticInitializerBlocks;
/*
 * Design Pattern--set of common practices to solve certain problems
 * 
 * Singleton Pattern
 *           -->> a pattern to make sure single instance of object is created 
 *           during/within the entire runtime application
 */
public class FlyingCars {
	
	int engineSize;
	
	public FlyingCars () {
		
	}
	
	public static FlyingCars getInstance () {
		FlyingCars f1 = new FlyingCars();
		return f1; //reference type as return type
	}

}
