package day50_inheritance;

public class ExtremeSport extends Sport {
	
	//What we observe here
	//same method name
	//same method parameter list
	//same return type
	//same access modifier
	//this method is in sub class
	//this is an instance method
	
	//this is the Optional annotation to make sure
	//you have overriden the method correctly
	
	@Override
	public void doSport() {
		System.out.println("doing extreme sport --- sky diving");
	}

	@Override
	public String toString() {
		return "Extreme Sport";
	}
	
	public static void main(String[] args) {
		
		ExtremeSport es1 = new ExtremeSport();
		es1.doSport();
		System.out.println(es1);//es1.toString()
	}
	


}
