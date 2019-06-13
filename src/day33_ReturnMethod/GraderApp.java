package day33_ReturnMethod;

public class GraderApp {
	public static void main(String[] args) {
		
		System.out.println(gradeTheScore (95));
		System.out.println(gradeTheScore (85));
		System.out.println(gradeTheScore (75));
		System.out.println(gradeTheScore (55));
		
	}
	
	public static char gradeTheScore (int grade) {
		if (grade <=100 && grade>=90) {
			return'A';
		} else if (grade<90 && grade >=80) {
			return'B';
		} else if (grade<80 && grade >=70) {
			return'C';
		}else {
			return'F';
		}
	}

}
