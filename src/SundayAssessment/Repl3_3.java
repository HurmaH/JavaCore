package SundayAssessment;

public class Repl3_3 {
	public static void main(String[] args) {
		
	}
	
	/**
	   * Reverses the order of the elements in the specified array
		 * @param arr
		 * @return array of strings
		 */
	  public static String[] reverse(String[] arr) {
			String str="" ;
		  for(int i=arr.length-1; i>=0; i--) {
				str += arr[i]+",";
			}
		  arr = str.split(",");
			return arr;
		}

}
