package day65_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCharacter {
	// GIVEN 
    String str = "ABCABCEFGADBHYKJSGD"; 
    // Find Out how many unique character 
    // HINT : 
    // Convert this to an array 
    // store it in List 
    // use one of data structure that store unique element 
	public static void main(String[] args) {
		
		String str = "ABCABCEFGADBHYKJSGD"; 
		
		//1.
		String [] strArr = str.split("");
		List <String> strList1 = Arrays.asList(strArr);
		Set<String> set = new HashSet<>(strList1); //Set<String> set = new HashSet<>(Arrays.asList(strArr));
		
		System.out.println(set);
		System.out.println("Number of unique: "+set.size());
		
		List<String> strList2 = new ArrayList<String>(set);
		System.out.println("Number of uniq chars: "+strList2.size());
		
		//2.
		Set <Character> charSet = new HashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			charSet.add(str.charAt(i));//auto boxing happens
		}
		
		System.out.println(charSet);
		System.out.println(charSet.size());
		
		//3.without set
		int uniq=0;
		String strUniq="";
		
		for (int i=0; i<str.length(); i++ ) {
			if (!strUniq.contains(""+str.charAt(i))) {
				strUniq+=str.charAt(i);
				uniq++;
			}
		}
		
		System.out.println(strUniq);
		System.out.println(strUniq.length());
		System.out.println(uniq);
	}

}
