package day38_MethodOverloading;

import java.util.ArrayList;

public class ArrayListString {
	public static void main(String[] args) {
			
	ArrayList<String> list1 = new ArrayList <>();
	list1.add("Superman");
	list1.add("Batman");
    list1.add("Aquaman"); 
    
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("Wonder Woman"); 
    list2.add("Cyborg"); 
    list2.add("Flash");
    
//    list1.addAll(list2) ; 
//    System.out.println(lst2);
    
    list1.addAll(2, list2); 
    
    System.out.println("Justice league : " + list1);
    
    //creating arraylist with all the items from another list
    ArrayList <String> list3 = new ArrayList <> (list1);//putting argument inside paranthesis
    
    System.out.println("Justice league Earth 2: " + list3);
}

}
