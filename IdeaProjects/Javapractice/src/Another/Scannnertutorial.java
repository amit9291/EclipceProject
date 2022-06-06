package Another;

import java.util.Scanner;

public class Scannnertutorial {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("whats your name?");
        String name = scan.next();

        System.out.println("How old are you ?");
        int age = scan.nextInt();*/
        double num1 , num2 ;
        Scanner scan = new Scanner (System.in );
        System.out.println("Enter first number :");
        num1 = scan.nextDouble();
        System.out.println("Enter second number :");
        num2 = scan.nextDouble();

        System.out.println("Enter an operator (+.-.*,/,%) : ");
        char operator = scan.next().charAt(0);
        scan.close();
        double output = 0;
        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            case '%':
                output = num1 % num2;
                break;
            default:
                System.out.println("Incorrect operator entered");
        }
        System.out.println(num1 + " " + operator + " " + num2 +" : " + output);
        }

}
