package day47_StaticKey;

public class InsBlockRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		InstanceBlock b1 = new InstanceBlock();
		System.out.println("--- ----"+b1.num);
		
		InstanceBlock b2 = new InstanceBlock("Will Smith");
		System.out.println("-------"+b2.num);
	}

}
