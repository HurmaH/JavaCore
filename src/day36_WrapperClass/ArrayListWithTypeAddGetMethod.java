package day36_WrapperClass;

import java.util.ArrayList;

public class ArrayListWithTypeAddGetMethod {
	public static void main(String[] args) {
		
		//No Primitive type is allowed as type, ex: int
		ArrayList <Integer> numList = new ArrayList <>();//only store Integer
		//numList.add("ABC"); ---> not applicable
		
		//Adding item
		//We call .add method from ArrayList class
		Integer i =100; //AutoBoxing to Integer Object
		numList.add(i);
		numList.add(200);
		numList.add(300);
		
		System.out.println(numList);
		
		//Getting single item from ArrayList
		//we call get (index) of ArrayList
		
		Integer i1 = numList.get(0); //Integer object
		System.out.println(i1);
		
		int i2 = numList.get(1);     //auto unboxing
		System.out.println(i2);
		
		System.out.println(numList.get(0)); //directly print
		
		System.out.println(numList);
		
	}

}
