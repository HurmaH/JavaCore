package day41_EncapsulationIntro;

public class AirConditionerTest {
	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
	    ac.brand = "Samsung";
	    ac.currentTemp = 75.6f;
	    ac.isOn =true;
	    
	    ac.displayTheBrand();
	    ac.displayAllInfro();
	    ac.turnOff();
	    ac.turnOn();
	    //ac.showCurrentTemp();
	    
	    ac.increaseTemp(10);
	    ac.decreaseTemp(20);
	    ac.setTemp(75);
	    //ac.showCurrentTemp();
	    
	}
	
	

}
