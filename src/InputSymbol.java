import java.util.Scanner;

public class InputSymbol {

    public static void main(String[] args){

        Scanner symbol = new Scanner(System.in);
        System.out.println("Enter two number");
        double a = symbol.nextInt();
        double b = symbol.nextInt();

        System.out.println("Enter an operator(+,-,*,/):");
        char operator = symbol.next().charAt(0);

        switch (operator){

            case'+':
                System.out.println(a+b);

                break;


            case'-':

                System.out.println(a-b);

                break;

            case'*':

                System.out.println(a*b);

                break;


            case'/':
                System.out.println(a/b);

                break;

            default:

                System.out.println("operator is not valid");



        }




    }
}
