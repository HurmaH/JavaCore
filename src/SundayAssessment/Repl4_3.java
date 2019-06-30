package SundayAssessment;

public class Repl4_3 {

}



class Pizza {
	private String size ; //  small, medium, or large
	private int cheeseToppings;
	private int pepperoniToppings;
	private int hamToppings;
	
	public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
		//super();
		this.size = size;
		this.cheeseToppings = cheeseToppings;
		this.pepperoniToppings = pepperoniToppings;
		this.hamToppings = hamToppings;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCheeseToppings() {
		return cheeseToppings;
	}

	public void setCheeseToppings(int cheeseToppings) {
		this.cheeseToppings = cheeseToppings;
	}

	public int getPepperoniToppings() {
		return pepperoniToppings;
	}

	public void setPepperoniToppings(int pepperoniToppings) {
		this.pepperoniToppings = pepperoniToppings;
	}

	public int getHamToppings() {
		return hamToppings;
	}

	public void setHamToppings(int hamToppings) {
		this.hamToppings = hamToppings;
	}
	
	public double calcCost() {
		double cost=0;
		if (size.equalsIgnoreCase("small")) {
			cost= 10+2*(getCheeseToppings()+getPepperoniToppings()+getHamToppings());
		}else if (size.equalsIgnoreCase("medium")) {
			cost= 12+2*(getCheeseToppings()+getPepperoniToppings()+getHamToppings());
		}else if (size.equalsIgnoreCase("large")) {
			cost= 14+2*(getCheeseToppings()+getPepperoniToppings()+getHamToppings());
		} 
		
		return cost;
	}
	
	public String getDescription() {
		return size+" Pizza with "
	           +cheeseToppings+" Cheese toppings, "
			   +pepperoniToppings+" Pepperoni toppings, and "
			   +hamToppings+" Ham toppings."+"\nTotal Price: "+calcCost();
	}
	
	
	
}
