import java.util.Scanner;
public class Turneryoperator {
    public static void main(String[] args) {
        System.out.println("Enter your number:  ");
        Scanner scanner = new Scanner(System.in); // calling new scanner class in main method
        int number = scanner.nextInt();
        String check = (number % 2 == 0) ? "Even" : "Odd";//turnery operator ?:
        System.out.println("This given number\t" + number + "\tis: " + check);// using \t is giving a space between 2 values.
    }

}
