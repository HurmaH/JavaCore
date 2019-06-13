package day21_ForLoop;

public class FizzBuzz {
	public static void main(String[] args) {
		
		//
		int count=0;
		//task 2.1 print odd number
		for (int i=1; i<=50; i++) {
			if (i%2==1) {//
				System.out.print(i+" ");
			}
		}
		
		//task 2.2 give count of divisible by 4
		for (int i=1; i<50; i++) {
		    if (i%4==0) {    //if (i%4!=0){
				count++;     //continue;}
							 //count++;
			}
	    }
		System.out.println();
		System.out.println("Count of numbers divisible by 4:"+count);
		
		//Task2.3, Task2.4
		int sum=0;
		for (int i=0; i<=50; i++) {
			if (i%3==0 && i%5==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println("Sum of numbers non divisible by 3 and 5: "+sum);
	}

}
