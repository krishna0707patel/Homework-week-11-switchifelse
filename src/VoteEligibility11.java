import java.util.Scanner;
public class VoteEligibility11 {
   static int age;  // define static variable
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:\t");  // taking output from the user
        int age = scanner.nextInt();
        if(age >= 18 ){    // using if else statement
            System.out.println("You are eligible for vote.");
        } else if (age <= 18) {
            System.out.println("You are not eligible for vote.");
        }
    }
}
