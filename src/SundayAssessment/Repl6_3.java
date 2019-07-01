package SundayAssessment;
/*
 * do_switch([1,2,3,4])
   returns:[[4,2,3,1]
 */
public class Repl6_3 {
	
	public static int[] do_switch(int[] i) 
	 {
		
		int temp = i[0];
		i[0]=i[i.length-1];
		i[i.length-1] = i[0]; 
		
		return i;

		
	}

}
