package day54_Inheritance_FinalKeyWord;

public class WarmUp {
	
	int num=100;
	
	
	{
		num=150;//step2
		System.out.println(num);//step3
				
	}
	
	{
		num=250;//step4
		System.out.println(num);//step5
				
	}
	
	
	public WarmUp() {
		num=200;//step4
		System.out.println(num);//step5
	}
	
	public WarmUp(int v) {
		num=v;
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		
		WarmUp w = new WarmUp();//step1
		System.out.println(w.num);
	}
	

}
