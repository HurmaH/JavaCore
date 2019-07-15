package day65_Collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
	
	public static void main(String[] args) {
		
		SortedSet<String> sSet = new TreeSet <>();
		sSet.add("Mishka");
		sSet.add("Hurmik");
		sSet.add("Sofiya");
		sSet.add("Mishka");
		sSet.add("Hurmik");
		sSet.add("Sofiya");
		sSet.add("Mishka");
		sSet.add("Hurmik");
		sSet.add("Juyje");
		
		System.out.println(sSet);
		
		//reverse
		Comparator <String> revers = Comparator.reverseOrder();
		sSet = new TreeSet <>(revers);
		sSet.add("Mishka");
		sSet.add("Hurmik");
		sSet.add("Sofiya");
		sSet.add("Mishka");
		sSet.add("Hurmik");
		sSet.add("Sofiya");
		sSet.add("Mishka");
		sSet.add("Hurmik");
		sSet.add("Juyje");
		System.out.println(sSet);
		
		//lambda
		sSet.forEach(each -> System.out.println(each));
		
	}

}
