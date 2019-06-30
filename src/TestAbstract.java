
public class TestAbstract extends HelloWorld2 {


//	{System.out.println("subclass int block running");}
		
public TestAbstract() {
		System.out.println("subclass no arg cons");
}
	
public TestAbstract(String name) {
	System.out.println("subclass 1 arg cons");
}

	public static void main(String[] args) {

		new TestAbstract("Hurma");
		
//		int i = 'c';
//		char c = 5;
//		boolean b =false;
		
//		b =(char) c;
//		b = (boolean) i;
//		i = (int)c;
//		c = 
	
	}

}
