package day8;

public class LogicalOperations {
	//Logical and operator &&
	//Logical or operator ||
	//Logical not operator !
	
	public static void main(String[] args) {
		
		boolean isHungry = true;
		boolean isBreakTime = false;
		boolean isYourLuchReady=true;
		
		
		System.out.println("are you hungry and is it break time "+(isHungry && isBreakTime));
		System.out.println("are you hungry or is it break time "+(isHungry || isBreakTime));
		
	}

}
