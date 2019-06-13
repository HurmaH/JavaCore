package day15;

public class SearchJavaVerifyResult {
	
	public static void main(String[] args) {
		
		String str = "About 813,000,000 results (0.56 seconds)";
		
		int about = str.indexOf("About");
		System.out.println(about);
		boolean con = str.contains("results");
		System.out.println(con);
		
//		
//		if (str.substring(0, 5).equals("About")) {
//			System.out.println("it started with \"About\"");
//		}else {
//			System.out.println("it did not start with About");
//		}
//		
//		if (str.contains("results")) {
//			System.out.println("it pass");
//		}else {
//			System.out.println("it failed");
//		}

	if (str.substring(0, 5).equals("About") && str.contains("results")) {
		System.out.println("it pass");
	}else {
		if (  ! str.substring(0,5).equals("About") ) {
			System.out.println("about did not start in the beginning");
		}else if(! str.contains("results")) {
			System.out.println("does not contains word results");
		}else {
			
		}
	}
	}

}
