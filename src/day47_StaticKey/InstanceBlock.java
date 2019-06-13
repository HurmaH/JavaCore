package day47_StaticKey;

import java.util.Random;

public class InstanceBlock {
	int num;
	
	//a block that run every time an object is being created
	//instance
	
	{
		System.out.println("GO SPARTANS, GO !!!");
		
		Random r = new Random ();
		num = r.nextInt(100);
	}
	
	static {
		System.out.println("GO SPARTANS, GO !!!, static");
	}
	
	public InstanceBlock() {
		System.out.println("CONSTRUCTOR");
	}
	
	public InstanceBlock(String name) {
		System.out.println("Constructor "+name);
	}

}
