import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Scanner;

public class LeapYear{

    public static void main(String [] args){

        System.out.println("Enter year");
        Scanner scanner = new Scanner (System.in);
        int year = scanner.nextInt();
        boolean leap = false;
         if (year % 4 == 0) {

             if (year % 100 == 0) {

                 if (year % 400 == 0) {

                     leap = true;
                 }
                 else {

                     leap = false;

                 }
             }
             else {
                 leap = true;
             }
         }

         else {
             leap = false;
         }

         if(leap)

         System.out.println(year + " is a leap year");

         else
             System.out.println(year + " is not a leap year");
         {

         }
    }
}





