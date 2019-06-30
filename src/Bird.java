
	public class Bird {
		protected String text = "floating"; // protected access
		protected void floatInWater() { // protected access
		System.out.println(text);
		} 
		
		public static void hello() {
			System.out.println("Hello");
		}
		
		public static void main(String[] args) {
			
			Bird.hello();
			
			Bird b = new Bird();
			b.floatInWater();
		}

}
