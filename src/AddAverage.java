import java.util.Scanner;

public class AddAverage {

    public static void main(String[] args) {


        int num1, num2, num3, num4, num5;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        num5 = scanner.nextInt();

        scanner.close();

        average = (double) (num1+num2+num3+num4+num5)/5;

        System.out.println("Average of last 5 number " +  average );






    }

}
