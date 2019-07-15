package day65_Collections;

//if we pass type as Integer , T will become integer 
public class Apple implements Edible <Integer> {

	public static void main(String[] args) {
		Edible <Integer> edible = new Apple(); //no dimond operator because we did not describe it
         edible.eat(300);	
	}
	
	@Override
	// since T is Integer data type 
    // this method will accept Integer 
	public void eat(Integer food) {
		System.out.println("Eating: "+food);
	}

}
