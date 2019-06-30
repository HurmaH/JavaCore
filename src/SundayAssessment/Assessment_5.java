package SundayAssessment;

import java.util.ArrayList;

public class Assessment_5 {
	int hurma;

	public static void hurma() {
		int hurma;
	}

	private Assessment_5() {
		// TODO Auto-generated constructor stub
	}

	private Assessment_5(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// 5.
		int ii = 0;

		int jj = 15;

		for (ii = 0; ii < jj - 1; ii = ii + 3) {

			System.out.print(ii + " ");

		}

		// 6.
		ArrayList<String> names = new ArrayList<>();

		names.add("Robb");

		names.add("Bran");

		names.add("James");

		names.add("Rick");

		names.add("Bran");

		if (names.remove("Bran")) {

			names.remove("John");

		}

		System.out.println(names);
		
		//7.
		ArrayList<Integer> points = new ArrayList<>();

		points.add(1);

		points.add(2);

		points.add(3);

		points.add(4);

		points.add(null);

		points.remove(2);

		points.remove(null);

		System.out.print(points);
		
		//9.
		Boolean[] bool = new Boolean[2];

		bool[0] = new Boolean(Boolean.parseBoolean("true"));

		bool[1] = Boolean.valueOf(null);

		System.out.println(bool[0] + "   " + bool[1]);
		
	}

}
