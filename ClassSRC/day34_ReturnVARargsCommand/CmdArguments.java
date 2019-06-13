package day34_ReturnVARargsCommand;

public class CmdArguments { 
	/*
	 * Command Line agument give you ability to pass external data/argument,
	 * while you are running your program using command line or in some other cloud
	 * it is commonly used
	 */
	
	/*
	 * Steps for CommandLine:
	 * 1. Create a class CmdArgument on Sublime
	 * 2. Save it on Desktop with name CmdArgument.java
	 * 3. go to command line - Powershell for windows
	 * 4. navigate to Desktop where file is saved
	 * 5. ls, cd Desktop;
	 * 6. compile file : javac CmdArgument.java 
	 * 7. ls again to see ganarted class file
	 * 8. run the file: java CmdArgument  
	 * 9. will give 0
	 * 10. running with giving String Array : java CmdArgument Hurmik Mekan Mishka
	 * 11. will give 3 ( length of array)
	 * 12. in sublime added for each loop to print all item of Array
	 * 13. compile it again on command line - javac CmdArgument.java 
	 * 14. run again on command line java CmdArgument Hurmik Mekan Mishka
	 * 15. it will give 3 and will print all names
	 * 
	 */
	
	/*
	 * How to do same thing on eclipse?
	 * run button --> Run Configurations --> (x)=Arguments -->Program Arguments 
	 * -->enter arguments --> Run --> you will see same result on Console
	 */

	  //String[] args is called command line arguments 
	  // and we can pass value using command line 
	  
	  public static void main(String... args) {

	    System.out.println(args.length);
	    for(String item: args){
	      System.out.println(item + " "); 
	    }

	  }

}
