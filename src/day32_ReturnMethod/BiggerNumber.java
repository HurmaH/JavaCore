package day32_ReturnMethod;

public class BiggerNumber {
	public static void main(String[] args) {
		
		int biggerNum = giveMeBiggerNumber (10,20);
		System.out.println(biggerNum);
		
		System.out.println(giveMeBiggerNumber (100, 25));
		
	}
	
	public static int giveMeBiggerNumber (int num1, int num2) {
		return (num1>num2)?num1:num2;
	}

}
