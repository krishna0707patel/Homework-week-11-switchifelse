
import java.util.Scanner;
public class SwitchCityname10 {
    public static void main(String[] args) {
        String alphabet; // define string variable inside the main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter between a to f: "); //taking output from the user
        alphabet = scanner.next();
        switch (alphabet) {   // using switch case
            case "a":
                System.out.println("amritsar");
                break;
            case "b":
                System.out.println("Benglore");
                break;
            case "c":
                System.out.println("Chandigadh");
                break;
            case "d":
                System.out.println("Delhi");
                break;
            case "e":
                System.out.println("East");
                break;
            case "f":
                System.out.println("Fatehpur");
                break;
            default:
                alphabet = "Invalid entry";
        }
        return;
    }
}




