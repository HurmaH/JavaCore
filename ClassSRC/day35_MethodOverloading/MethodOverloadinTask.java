package day35_MethodOverloading;

public class MethodOverloadinTask {
	public static void main(String[] args) {
		System.out.println(addNums (20,22));
		System.out.println(addNums (20,22,15));
		addNums (20,22,15,26);
	}
	
	public static int addNums (int n1, int n2) {
		return n1+n2;
	}
	
	public static int addNums (int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	public static void addNums (int n1, int n2, int n3, int n4) {
		System.out.println(n1+n2+n3+n4);;
	}

}
