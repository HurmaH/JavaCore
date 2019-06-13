package day37_ArrayList;

import java.util.ArrayList;

public class RemoveItemFromIntegerList {
   public static void main(String[] args) {
	
	   ArrayList <Integer> lst = new ArrayList <>();
	   lst.add(1);
	   lst.add(2);
	   lst.add(3);
	   lst.add(4);
	   lst.add(5);
	   
	   lst.remove(2); //will remove index
	   System.out.println(lst);
	   
	   lst.remove(new Integer (2)); // will remove value 2
	   lst.remove(Integer.valueOf(3));// will remove value 3
	   System.out.println(lst);
}
}
