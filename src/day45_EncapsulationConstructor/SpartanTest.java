package day45_EncapsulationConstructor;

public class SpartanTest {
	
	public static void main(String[] args) {
		
		Spartan s1 = new Spartan ();
		System.out.println("Empty object:");
		System.out.println(s1);
		
		String [] certs = {"OCA", "PSM", "AWS", "OCP" };
		
		Spartan s2 = new Spartan("Coder2", 8, 600, false, certs);
		Spartan s3 = new Spartan("Coder3", 5, 320, true, certs);
		Spartan s4 = new Spartan("Coder4", 4, 300, false, certs);
		Spartan s5 = new Spartan("Coder5", 7, 300, true, new String [] {}); //cert is empty
		Spartan s6 = new Spartan("Coder6", 10, 200, false, null);
		
		
		System.out.println(s2);//we are printing object directly
		System.out.println(s2.toString());//compiler do automtically
		
		System.out.println("s7:");
		Spartan s7 = new Spartan ("Hurma", 14,300, false, new String [] {"OCA", "PSM 1"});
		System.out.println(s7);
		
		System.out.println("s8:");
		Spartan s8 = new Spartan (true);
		System.out.println(s8);
	}

}
