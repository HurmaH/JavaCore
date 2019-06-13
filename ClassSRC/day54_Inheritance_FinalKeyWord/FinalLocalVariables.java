package day54_Inheritance_FinalKeyWord;

public class FinalLocalVariables {
	
	public static void main(String[] args) {
		//cannot reassign a value for final variable
		//a primitive type store value directly so final variable
		//x can not have new value here
		final int x  = 10;
		//x = 12;
		
		
		/*
		 * a reference variable store address of the object
		 * once it is pointed to the object, it cannot point to 
		 * different object
		 */
		final Building b1 = new Building (100);
		//b1 = new Building (300); //--->> final local variable
		b1.num=200;
		
		Building b2 = b1; //one dog two leash
		b2 = new Building (110); //not final local variable
		
		System.out.println(b1.num);
		
	}
	
}

class Building {
	int num;
	public Building (int num) {
		this.num = num;
	}
}
