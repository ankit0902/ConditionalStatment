import java.util.Scanner;

public class InterChangeValue {

    public static void main(String[] args){


        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value ");

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("before swapping\na="+ a+"\nb" +b);

        a= a + b;
        b= a-b;
        a= a-b;

        System.out.println("After swapping\na=" + a + "\nb=" + b);


    }

}
