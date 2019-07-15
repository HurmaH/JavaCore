package day65_Collections;

public class Orange implements Edible <String> {

	public static void main(String[] args) {
		Edible <String> edible= new Orange();
		edible.eat("Sarma");
	}
	
	@Override
	public void eat(String food) {
		System.out.println("Eating food "+food);
		
	}
	
	

}
