package SundayAssessment;

import java.util.ArrayList;
import java.util.List;

public class Assessment6 {
	
	public static void main(String[] args) {
		//1 
		Student student = new Student("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks);
        
        //2
        List<Character> list = new ArrayList<>( );

        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        list.contains('O');
        
        if( list.contains('O')) {
            list.remove('O');

        }
        
        System.out.println(list);
//
//        for( char ch : list ) {
//
//           System.out.print ( ch );
//
//        }
        
        //3
        String [ ]   fruits =  {"apple", "banana",  "mango",  "orange"};

        for(String  fruit :  fruits) {

            System.out.print( fruit + " " );

            if( fruit.equals("mango") ) {

                continue;

            }

            System.out.println("salad!");

            break;

        }  
        
        //4. 
    }



    private static void review( Student  stud ,  int  marks) {
        marks = marks + 10;
        stud.marks += marks;
    }
	
	

}
class Student {

    String name;

    int marks;

    Student(String name, int marks) {

        this.name = name;

        this.marks = marks;

    }

}


