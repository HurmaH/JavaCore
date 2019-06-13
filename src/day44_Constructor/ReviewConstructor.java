package day44_Constructor;

public class ReviewConstructor {
	
	public void ReviewConstructor () {//not constrctor
		System.out.println("BOOM");
	}
	
	public ReviewConstructor () { //constructor has not return type, and any modifier can be used
		System.out.println("BOOM Real");
	}
	
	public static void main(String[] args) {
		
		ReviewConstructor rc = new ReviewConstructor();//I am calling constructor without param
		//ReviewConstructor rc = new ReviewConstructor("abc"); //give error as there is no constructor with String param
	}

}
