import java.util.Scanner;

public class StudentResult {

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


        System.out.println(English + Maths + Science);


        if (English<35 || Maths <35 ||Science <35){

            System.out.println("Fail");}

        else
        {
            System.out.println("Pass");


        }

}









}
