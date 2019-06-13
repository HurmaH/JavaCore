package day54_Inheritance_FinalKeyWord.soccer;

public class Stadium {
    int capacity;
	String food;
	
	//Add 2 arg Constructor
	public Stadium(int capacity, String food) {
		//super();
		this.capacity = capacity;
		this.food = food;
	}



	//Add Getters and Setters
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	
    //Add toString method
	@Override
	public String toString() {
		return "Stadium [capacity=" + capacity + ", food=" + food + "]";
	}
	
	
	
	
	
}
