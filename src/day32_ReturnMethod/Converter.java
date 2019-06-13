package day32_ReturnMethod;

public class Converter {
	public static void main(String[] args) {
		System.out.println(meterToCm (4));
		
		System.out.println(feetToInch(98));
	}
	
	public static int meterToCm (int m) {
		//1meter=100cm
		return m*100;
	}
	
	public static double feetToInch (int feet) {
		//1feet=12inch
		return feet*12;
	}
	
	public static double FahToCel (int Fah) {
		//(32°F − 32) × 5/9 = 0°C
		return (Fah-32)*5/9;
		
	}
	
	
	

}
