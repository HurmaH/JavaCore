package day53_Inheritance_Hiding;

public class Planet {

	public void rotate() {
		System.out.println("Rotating");
	}
	
	//Overloading care about signature: parameter and name
	public void rotate(int d) {
		System.out.println("Rotating ddddd");
	}

//	public int rotate(int d) {                //will give error same signature
//		System.out.println("Rotating ddddd");
//	return 5;
//	}
	
	public static int rotate(int d, int y) {
		System.out.println("Rotating ddddd with return");
		return 5;
	}
}


