package day43_EncapsulationConstructorIntro;

public class ProductGetterSetter {
	
	private String name;
	private double price;
	private float  rating;
	private String productId;
	
	//create a method to set the value of all fields
	
	public void initiliazeAllFieldValues (String name, double price, float  rating, String productId) {
		
		this.name = name;
        this.rating = rating;
        this.price = price;
        //this.productId = productId; 
        // Optionally 
        // you can do above by calling setter method 
        setProductId(productId);
        
     }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	

}
