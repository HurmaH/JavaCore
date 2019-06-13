package day33_ReturnMethod;

public class WarmUp {
/*
 * Warmup 1.1

Create a static method
getSum  
accept 1 paramter as int array 
and return the sum of the all the items in array

another method called 
addAll 
accept 1 paramter as String array 
and return the concatenation of all items 

another method called 
getMax 
accept 1 paramter as int array 
and return the max from the all the items in array
 */
	public static void main(String[] args) {
		
		int[] nums = new int [] {1,2,3,56,5,7};
		int sum = getSum(nums);
		System.out.println("Sum of all numbers" +sum);
		
		//invoking method and not to store
		System.out.println(getSum (new int[] {1,3,4,5,1,1,1,1}));
		
		System.out.println("Max of all numbers"+getMax(nums));
		
		String [] names = { "Emine", "Firdevs", "Sharif", "Bahadir", "Mehmet"};
		String result = addAll(names);
		System.out.println(result);
	}
	
	//getSum
	public static int getSum (int [] num) {
		int sum=0;
		for (int i=0; i<num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	//addAll
	public static String addAll(String [] str) {
		String addStr="";
		for (int i=0; i<str.length; i++) {
			addStr+=str[i];
		}
		
		return addStr;
	}
	
	//getMax
	public static int getMax (int [] num) {
		int max = num[0];
		for (int i=0; i<num.length; i++) {
			if (max>num[i]) {
				max = num[i];
			}
		}
		
		return max;
	}
	
	
	
	
	

}
