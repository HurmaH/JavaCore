package day54_Inheritance_FinalKeyWord;

public class Engine {
	//final instance fields
	final String engineType;
	final int cylinderCount;
	
	
	
	public Engine(String engineType, int cylinderCount) {
		//super();
		this.engineType = engineType;
		this.cylinderCount = cylinderCount;
	}


	public void start() {
		System.out.println("Engine <"+engineType+"> with cylinder type <"+cylinderCount+"> is starting");
	}
	
	@Override
	public String toString() {
		return "Engine [engineType=" + engineType 
				+ ", cylinderCount=" + cylinderCount + "]";
	}
	

}
