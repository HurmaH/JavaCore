package day57_Interface;

public class DriverTest {
	public static void main(String[] args) {
		// WebDriver is an interface that we created 
	    // ChromeDriver is a class that implement WebDriver
		
		WebDriver driver = new ChromeDriver(); 
	    driver.navigateTo("google");
	    
	    // FirefoxDriver is a class that implement WebDriver
	    /*
	     * driver = new FirefoxDriver(); 
	     * driver.navigateTo("google");
	     */
	    
	    // this is creating object
	    // without storing the address of the object 
	    // and just using it once -- like calling method as below
	    
	    // this object is not accessible after this line
	    // because we did not write down the address
	    
	}

}
