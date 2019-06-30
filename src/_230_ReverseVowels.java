

public class _230_ReverseVowels{
	public static void main(String[] args) {
		System.out.println(reverseVowels("apple"));
	}
	
	public static String reverseVowels(String str) {
		String [] strArr = str.split("");
		String vowel= "aeiou";
		int i=0;
		int j=strArr.length-1;
		while(i<j) {
			if (!vowel.contains(strArr[i])) {
				i++;
				continue;
			}
			if(!vowel.contains(strArr[j])){
				j++;
				continue;
			}
			//swap
		    String temp = strArr[i];
			strArr[i]=strArr[j];
			strArr[j]=temp;
		}
		
		String strNew="";
		for(int k=0; k<strArr.length; k++) {
			strNew += strArr[k];
		}
		
		return strNew;
		
	}

}
