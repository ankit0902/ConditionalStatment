import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {



       Scanner scanner = new Scanner(System.in);
        System.out.println("Sales id:");
        String id= scanner.next();
        System.out.println("Seller's Name: ");
        String SellerName = scanner.next();
        System.out.println("Sales Amount:");
        int a  = scanner.nextInt();




        if (a >= 50000) {

            System.out.println("Sales Commission is ");
            System.out.println(a*35/100);

        } else if (a  >= 30000) {

            System.out.println("Sales Commission is");
            System.out.println(a*20/100);

        } else if (a  >= 20000) {

            System.out.println("Sales Commission is");
            System.out.println(a*10/100);
        } else if (a >= 10000) {

            System.out.println("percentage is 5");
        }

        else {

            System.out.println("Sales Commission is");
            System.out.println(a*2/100);



        }

    }

    }


























