import java.util.Scanner;

public class Value {



        public static void main (String [] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any character");
            char ch = scanner.next().charAt(0);
            boolean type = false;

            if (ch>='0' && ch<='9'){
                System.out.println(ch + " is a number");
            }
            else if (ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                System.out.println(ch + " is an alphabet");
            }
            else {
                System.out.println(ch + " is a symbol");
            }
        }


    }


