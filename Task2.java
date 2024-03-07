//STUDENT GRADE CALCULATOR
import java.util.*;
public class Task2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("STUDENT GRADE CALCULATOR");

        System.out.print("Enter the number of students = ");
        int n = s.nextInt();

        System.out.println("Enter the marks of the respective subjects out of 100:");

        for(int i=1;i<=n;i++){

            System.out.println("Student "+i);

            System.out.print("English = ");
            int e = s.nextInt();
            System.out.print("Hindi = ");
            int h = s.nextInt();
            System.out.print("Science = ");
            int sc = s.nextInt();
            System.out.print("Social Science = ");
            int ss = s.nextInt();
            System.out.print("Maths = ");
            int m = s.nextInt();

            System.out.println("RESULT :");
            int total_marks = e+h+sc+ss+m;
            System.out.println("Total Marks = "+ total_marks);

            double avg_marks = total_marks/5;
            double avg_percent = (avg_marks/100)*100;
            System.out.println("Average percentage = "+ avg_percent +"%");

            String grade;
            switch((int)avg_marks/10){
                case 10:
                case 9:
                  grade = "A";
                  break;
                case 8:
                  grade = "B";
                  break;
                case 7:
                  grade = "C";
                  break;
                case 6:
                  grade = "D";
                  break;
                case 5:
                  grade = "E";
                  break;
                default:
                  grade = "F";
                break;
            }
            System.out.println("Grade = "+grade+"\n");
        }
    }
}
