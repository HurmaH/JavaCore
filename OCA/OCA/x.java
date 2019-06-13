package OCA;

import java.util.ArrayList;
import java.util.List;

public class x {
	public static void main(String[] args) {
		
		int aVar = 9;// What is the result if the integer aVar is 9?
		if (aVar++ < 10) {
			System.out.println(aVar + " Hello World!");
			} else {
				System.out.println(aVar + " Hello Universe!");
				}
		
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2;// Line n1
		//String s4 = (String) (s3 * s2);// Line n2
		//System.out.println("Sum is " + s4);
		
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a < b) ?  a : (b < c) ? b : c;
		System.out.println(d);
		
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		if (names.remove("Bran")){
			names.remove("Jon");
			}
		System.out.println(names);
	}

}
