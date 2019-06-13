package day38_MethodOverloading;

import java.util.ArrayList;


public class ArrayListPractice2 {
	public static void main(String[] args) {
		
		ArrayList <Integer> intNum = new ArrayList <>();
		//from 1-100
		for (int i=1; i<=100; i++) {
			intNum.add(i);
		}
		System.out.println(intNum);
		
		//sum
		int sum=0;
		for (int each: intNum) {
			sum += each;
		}
		System.out.println("sum: "+sum);
		
		//average
		int ave = sum/intNum.size();
		System.out.println("average: "+ave);
		
		
		ArrayList <Integer> intNum2 = new ArrayList <>();
		//from 100-1
		for (int i=100; i>=1; i--) {
			intNum2.add(i);
		}
		System.out.println(intNum2);
		
		//get count divisible by 3 and 5
		int count=0;
		for (int each:intNum2) {
			if (each%15==0) {
				count++;
			}
		}
		System.out.println("count divisible by 3 and 5: "+count);
		
		//Optional
		//Combine above 2 lists -- add everything from 2nd list to first one
		intNum.addAll(intNum2);
		System.out.println(intNum);
		
		//if .addAll restricted :)))
		for (int i=0; i<intNum2.size();i++) {
			intNum.add(intNum2.get(i));
		}
		
		//Update every odd items to 0 ;
				
		for (int i=0; i<intNum.size(); i++) {
			if (intNum.get(i)%2==0) {
				intNum.set(i, 0);
			}
		}
		
		System.out.println(intNum);
		
		//cannot assign value to each
//		for (int each:intNum) {
//			if (each%2==0) {
//				each=0;
//			}
//		}
		
	}

}
