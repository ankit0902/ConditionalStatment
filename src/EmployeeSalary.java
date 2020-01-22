import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        String employee = scanner.next();
        System.out.println("Enter Basic Salary");
        int sal = scanner.nextInt();
        System.out.println("HRA =");
        System.out.println(sal * 10/100);
        System.out.println("TA =");
        System.out.println(sal*9/100);
        System.out.println("PF = ");
        System.out.println(sal * 20/100);
        System.out.println("Gross Salary = ");
        System.out.println(sal + (sal*10/100)+(sal*9/100)+(sal*8/100)+(sal*20/100) );


}
}