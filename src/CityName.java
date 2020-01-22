import java.util.Scanner;

public class CityName {

    public static void main(String[] args) {

        char c;
        String CityName;


        System.out.println("Enter Character : ");

        Scanner s = new Scanner(System.in);
        c = s.next().charAt(0);


        switch (c) {

            case 'A':

                System.out.println("Ahmedabad");

                break;

            case 'B':

                System.out.println ("Bombay");

                break;

            case 'C':

                System.out.println  ("Calcutta");

                break;

            case 'D':

                System.out.println("Delhi");

                break;

            case 'E':

                System.out.println("Edinburgh");

            case 'F':

                System.out.println("florida");

            default:

                System.out.println("Invalid");


        }




    }

}