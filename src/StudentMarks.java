import java.util.Scanner;

public class StudentMarks {

    public static void main(String [] args) {


        int rollno, English, Maths, Science, total;
        double percentage;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String student = sc.next();
        System.out.println("Enter Roll No");
        rollno = sc.nextInt();

        System.out.println("Enter English Marks");
        English = sc.nextInt();
        System.out.println("Enter Maths Marks");
        Maths = sc.nextInt();
        System.out.println("Enter Science Marks");
        Science = sc.nextInt();


        total = English + Maths + Science;
        percentage = (total / 300.0) * 100;


        System.out.println("Total Marks Obtained " + total);
        System.out.println("Percentage is " + percentage);

        if (percentage > 35) {
            System.out.println("is Passed");
        } else {
            System.out.println("is failed");
        }

        if (percentage >= 80) {

            System.out.println("Grade is A+");
        } else if (percentage >= 60) {

            System.out.println("Grade is A");
        } else if (percentage >= 50) {

            System.out.println("Grade is B");
        } else if (percentage >= 35) {

            System.out.println("Grade is C");
        } else
            System.out.println("Failed");
    }
        }






















