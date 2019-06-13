package day51_superOverriding;

public class horse extends Animal{ 
	
	@Override
	public void makeNoise() {
		//System.out.println("Horse make noise - neigh neigh");
		 //System.out.println("General Noise");
	    System.out.println("Neigh Neigh");
	    super.makeNoise();
	    System.out.println("done neighing");
	    super.makeNoise();
	    System.out.println("now really done neighing");
	    
	}

}
