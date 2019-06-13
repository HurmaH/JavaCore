package day36_WrapperClass;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
	public static void main(String[] args) {
		
		int i = 10;
		Scanner scan = new Scanner (System.in); //scan reference - have address of object
		Double d = new Double ("2.14"); // d reference
		float f = 1.4f;                 // primitive holds value
		
		//1. Creating without any type
		//An arrayList variable list1 is created
       // an ArrayList object is created and assigned to list1
		//it did not specify what we can store in this arralist
		//so we can store any type
		
		ArrayList list1 = new ArrayList ();  //list1 -->
		list1.add("abc");
		list1.add("efg");
		list1.add(new Integer (10));
		list1.add(Character.valueOf('A'));
		
		System.out.println(list1);
		//2. Creating ArrayList with type
		ArrayList <String> list2 = new ArrayList <>();
	}

}
