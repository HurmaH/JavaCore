package SundayAssessment;

import java.util.ArrayList;

public class Repl8_3 {
//	Method returns a report with the price for each ordered item and total price.
//	If the requested quantity is bigger than the stock 
// it will comment that the order item has less than what was ordered and wont be included 
// in the final price.
//	Example:
//	order = {
//	["Rautour Viejo","20","100","200"]
//	["Culung Garrafeira","30","10","9900"]
//	["Lirnolon Sec","200","2","1"]
//	}
//	then wineSeller() returns:
//	*Rautour Viejo 100 price:2000
//	*Culung Garrafeira 10 price:30
//	*Lirnolon Sec 2 quantity too big
//	 
	
	//The  array of string holds : 
	//the name of the wine, its price, the ordered amount and quantity.
	
	public String wineSeller(ArrayList<String[]> r) {
		 
		String order = "";
		int totalPrice =0;
		    
		    for (int i=0 ; i<r.size(); i++) {
		    	int price = Integer.parseInt((r.get(i))[1]);
		    	int amount = Integer.parseInt((r.get(i))[2]);
		    	int quantity = Integer.parseInt((r.get(i))[3]);
		    	
		    	int itemTotal =price*amount;
		    	
		    	if (amount<quantity) {
		    		order += "*"+(r.get(i))[0]+" "+amount+" price:"+itemTotal+"\n";
		    		totalPrice += itemTotal;
		    	}else {
		    		order += "*"+(r.get(i))[0]+" "+amount+" quantity too big\n";
		    	}
		    	
		    }
		    
		   
    return order+"\n"+"total price:"+totalPrice;
		   
    }//end wineSeller
	
	public static void main(String[] args) {
		Repl8_3 m = new Repl8_3();
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"Rautour Viejo","20","100","200"});
	    arr.add(new String[]{"Culung Garrafeira","30","10","9900"});
	    arr.add(new String[]{"Lirnolon Sec","200","2","1"});

	    String recipt = m.wineSeller(arr);
	    System.out.print(recipt);
	    //  shod output:
	    // *Rautour Viejo 100 price:2000
	    // *Culung Garrafeira 10 price:30
	    // *Lirnolon Sec 2 quantity too big
	    
	    // total price:2030
	   
	    
	  }//end main
	
	
	

}
