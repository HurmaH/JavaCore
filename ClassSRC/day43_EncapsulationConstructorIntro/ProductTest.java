package day43_EncapsulationConstructorIntro;

public class ProductTest {
	
	public static void main(String[] args) {
		

	    ProductGetterSetter  p1 = new ProductGetterSetter (); 
	    p1.initiliazeAllFieldValues("Watch", 113.39, 4.5f, "x123");
	    
	    System.out.println(  p1.getName()  );
	    System.out.println(  p1.getRating()  );
	    System.out.println(  p1.getPrice()  );
	    System.out.println(  p1.getProductId()  );
	    
	    // 20 $ sale is on going , change the value of price
	    p1.setPrice(113.39 - 20);
	    
	    
	    String productInfo = "Bag, 399.99, 4.9, Gucci12";   //Product info is given in info
	    String [] productSplitted = productInfo.split(", ");//turning into Product Object
	    String productName = productSplitted[0];            //index=0 --->productName
	    
	    double productPrice = Double.parseDouble(productSplitted[1]);//price is a double so need to convert to double 
	                                                                 // Double.parseDouble(strObject) --> return double
        float productRating = Float.parseFloat(productSplitted[2]);	 //rating is a float, so need to convert to float 
                                                                     // Double.parseDouble(strObject) --> return double
        String productId = productSplitted[3];  // getting the product id using index 3
        
        // creating new Object and call the method we created to set all field values
        ProductGetterSetter  p2 = new ProductGetterSetter (); 
        p2.initiliazeAllFieldValues(productName, productPrice, productRating,  productId);
        System.out.println(  p2.getName()  );
	    System.out.println(  p2.getRating()  );
	    System.out.println(  p2.getPrice()  );
	    System.out.println(  p2.getProductId()  );
	}

}
