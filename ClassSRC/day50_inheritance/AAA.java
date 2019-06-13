package day50_inheritance;

public class AAA extends AA{ //explicitly extends Object class
	public static void main(String[] args) {
		
		AAA a = new AAA();
	}
	
	public AAA () {
		super ();//even if it is not written here compiler will do implicitly
		System.out.println("AAA Constructor");
	}

}
