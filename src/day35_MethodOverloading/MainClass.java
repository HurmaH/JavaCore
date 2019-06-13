package day35_MethodOverloading;

public class MainClass {
	
	public static void main (String [] args) {//data type does matter
	/*
	 * Java MainClass abc d egf
	 * this is how it's working behind scene
	 * String[] args = {"abc", "d", "egf"};
	 * if we dont pass any cmd argument
	 * String [] arg ={};
	 */
		System.out.println("I did not come this far just to come this far");
		System.out.println(args.length); //0
		System.out.println(args[0]);     //outOfBondException
	}

}
