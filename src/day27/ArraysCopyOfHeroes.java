package day27;

import java.util.Arrays;

public class ArraysCopyOfHeroes {
	public static void main(String[] args) {
		
		String [] heroes = {"MomOf5", "Shrek", "Elsa", "Wonder Woman", 
				             "Cinderella", "Aquaman"};
		
		String [] heroesCopied = new String [heroes.length];
		
		for (int i=0; i<heroesCopied.length; i++) {
			heroesCopied[i] = heroes[i];
		}
		
		System.out.println(Arrays.toString(heroesCopied));
		
		//WITHOUT UTILITY 
		
		//sort this Array
		Arrays.sort(heroesCopied);
		
		//use for each loop through all of them
		//if this array has hero, you look
		//print "Bingo"
		
		for (String hero: heroesCopied) {
			if (hero.equals("Elsa")){
				System.out.println("Bingo");
			}
		}
		
		//WITH UTILITY
		String [] copyOf2 = Arrays.copyOf(heroes, 2);		
		String [] copyOf6 = Arrays.copyOf(heroes, 6);
		String [] copyOf0 = Arrays.copyOf(heroes, 0);
		String [] copyOf10 = Arrays.copyOf(heroes, 10);
		
		System.out.println(Arrays.toString(copyOf0));
		System.out.println(Arrays.toString(copyOf10));
	}

}
