package day41_EncapsulationIntro;

public class AirConditioner {
	
	String brand;
	float currentTemp;
	boolean isOn;
	
	public void displayTheBrand() {
		System.out.println("Brand: "+brand);
	}
	
	public void showCurrentTemp() {
		System.out.println("Current Temp: "+currentTemp);
	}
	
	public void displayAllInfro() {
		System.out.println("Brand: "+brand+", Current Temp: "+currentTemp);
	}
	
	public void turnOn() {
		System.out.println("current AC is: "+isOn);
		if (isOn==false) {
			isOn=true;
		}else {
			System.out.println("It is already on!!!");
		}
	}
	
	public void turnOff() {
		
		if (isOn) {
			isOn = false;
			System.out.println("it has been turned off");
		}else {
			System.out.println("It is already off!!!");
		}
		
	}
	
	public void increaseTemp(int temp) {
		currentTemp += temp;
		showCurrentTemp();
		//System.out.println("Current Temp: "+currentTemp);
	}
	
	public void decreaseTemp(int temp) {
		currentTemp -= temp;
		showCurrentTemp();
		//System.out.println("Current Temp: "+currentTemp);
	}
	
	public void setTemp(int targetTemp) {
		currentTemp = targetTemp;
		showCurrentTemp();
		//System.out.println("Current Temp: "+currentTemp);
	}
	

}
