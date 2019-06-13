package day45_EncapsulationConstructor;

public class MathEquationTest {
	public static void main(String[] args) {
		
		MathEquation2 math1 = new MathEquation2 ();
				
		math1.calculate();
		System.out.println(math1.getResult());
		
		math1.calculateX(100,200);
		System.out.println(math1.getResult());
	}

}
