import java.util.Scanner;

public class SwitchDay15 {
    public static void main(String[] args) {
        int number;
        // define variable in int.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your day number: ");  // taking output from the user
        number = scanner.nextInt();


        switch(number){  // using switch case
            case 1:
                System.out.println("Today is Monday.");
                break;
            case 2:
                System.out.println("Today is Tuesday.");
                break;
            case 3:
                System.out.println("Today is Wednesday.");
                break;
            case 4:
                System.out.println("Today is Thursday.");
                break;
            case 5:
                System.out.println("Today is Friday.");
                break;
            case 6:
                System.out.println("Today is Saturday.");
                break;
            case 7:
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Invalid Weekday.");
            break;
        }
    }
}
