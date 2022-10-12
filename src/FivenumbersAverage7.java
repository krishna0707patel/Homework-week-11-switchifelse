import java.util.Scanner;

public class FivenumbersAverage7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // calling object in main method
        System.out.println("Enter your 1st number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter your 2nd number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter your 3rd number: ");
        int number3 = scanner.nextInt();

        System.out.println("Enter your 4th number: ");
        int number4 = scanner.nextInt();

        System.out.println("Enter your 5th number: ");
        int number5 = scanner.nextInt();

        System.out.println("Average of five number is: " +(number1+number2+number3+number4+number5) / 5);
    }
}
