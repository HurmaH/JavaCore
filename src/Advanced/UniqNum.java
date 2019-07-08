package Advanced;

import java.util.ArrayList;

public class UniqNum {
	public static void main(String[] args) {
		
		int num [] = {4,5,5,5,6,6,9,4};
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int i=0; i<num.length; i++) {
			int count =0;
			for (int j=0; j<num.length; j++) {
				if(num[i]==num[j]) {
					count++;
				}
			}
			
			if (count==1) {
				numList.add(num[i]);
			}
		}
		
		System.out.println(numList);
	}

}
