import java.util.Scanner;
public class SwitchNumbersymbol13 {
    public static void main(String[] args) {
        double num1,num2; // calling instance variable inside the main method
        char symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:  "); // taking input from the user
        num1 = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number 2:  ");
        num2 = scanner.nextDouble();


        System.out.println("Enter symbol(+,-,*,/):  ");
        symbol = scanner.next().charAt(0);
        scanner.close();
        System.out.println(num1+"  "+symbol+"  "+num2+"  =  ");

        switch (symbol){    // using switch case
            case '+':
                System.out.println(num1+num2); break;
            case '-':
                System.out.println(num1-num2); break;
            case '*':
                System.out.println(num1*num2); break;
            case '/':
                System.out.println(num1/num2); break;
            default:
                System.out.println("Invalid symbol");
        }
        return;
    }
}
