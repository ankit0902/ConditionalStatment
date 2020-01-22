import java.util.Scanner;

public class UpperToLower {

    public static void main(String [] args){


        Scanner scanner = new Scanner(System.in);

        String str ="";

        System.out.println("Enter word :");
        str = scanner.nextLine();

        String lowerCaseString = "",upperCaseString = "";
        lowerCaseString = str.toLowerCase();
        upperCaseString = str.toUpperCase();

        System.out.println("Lower Case String:" + lowerCaseString);
        System.out.println("Upper Case String:" + upperCaseString);















    }


}
