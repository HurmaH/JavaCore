package day57_Interface;

import java.util.ArrayList;

public interface WebDriver {
	
	String PURPOSE = "Automating Browser";//constant 
	
	//openBrowser accept no param and return nothing
	public abstract void openBrowser();
	
	//navigateTo accept a String as Url and return nothing 
	public abstract void navigateTo (String url);
	
	//quit accept no param and return nothing
	public abstract void quit ();

	//findElementByID accept one int as id and return String
	public abstract String findElementByID (int id);
	
	//findElementsByTagName accept one String as tagName and return ArrayList of Strings 
	public abstract ArrayList<String> findElementsByTagName (String tagName); 
	
	//Default method -- allowed only in interface
	/*It is defined using default keyword and it has body
	 * We can just inherit it as is 
	 * or we can override to provide actual implementation
	 */
	public default void clickButton (String name) {
		System.out.println("DO YOUR IMPLEMENTATION WITHOUT BREAKING ");
	}
	
	//you can call abstract method in default method
	//concrete class will have implementation anyway
	public default void clickButtonAndEnterText () {
		System.out.println("MY BLUE BUTTON ");
		System.out.println("Entering Cybertek");
		quit ();
	}
	
	//static method of interface is not inherited
	public static void showPurpose() {
		 System.out.println("purpose is " + PURPOSE);
	}

}
