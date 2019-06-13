package day57_Interface;

import java.util.ArrayList;

public class ChromeDriver implements WebDriver {
	
	public static void main(String[] args) {
		ChromeDriver driver1 = new ChromeDriver();
		driver1.quit();
		ChromeDriver driver2 = new ChromeDriver(5, 10);
		driver2.navigateTo("www.cybertekschool.com");
		driver2.openBrowser();
		driver2.findElementByID(100);
		
		ArrayList <String> allElements = driver2.findElementsByTagName("p");
		System.out.println(allElements);
		
		driver2.clickButton("abc");
		driver2.clickButtonAndEnterText();
		
		WebDriver.showPurpose();
	}
	
	
	int screenSize ;
	double positionX;
	// any time i create a ChromeDriver Object 
	// it should automatically open the browser
	
	public ChromeDriver(int screenSize, double positionX) {
		//super();
		this.screenSize = screenSize;
		this.positionX = positionX;
		openBrowser();
	}
	
	public ChromeDriver() {
		System.out.println("ChromeDriver with no arg");
		openBrowser();//to open browser everytime object is created
	}

	@Override
	public void openBrowser() {
		System.out.println("Open Browser");
	}

	@Override
	public void navigateTo(String url) {
		System.out.println("navigating to URL "+url);
	}

	@Override
	public void quit() {
		System.out.println("Closing browser");
	}

	@Override
	public String findElementByID(int id) {
		System.out.println("Looking for element hard with id"+id);
		return "my Element";
	}

	@Override
	public ArrayList<String> findElementsByTagName(String tagName) {
		System.out.println("looking for all the elements with tagName "+tagName);
		
		ArrayList<String> allElements = new ArrayList<String>(); 
	    allElements.add("first checkbox"); 
	    allElements.add("another textbox");
	    allElements.add("sign up link");
	    
	    return allElements;
	}
	
	@Override //Default method -- allowed only in interface
	public void clickButton (String name) {
		System.out.println("Clicking button"+name);
	}

	

}
