import java.util.Scanner;
public class AlphabetsUpperlower12 {
    private static Scanner scanner;
    public static void main(String[] args) {
        String uppStr;
        int i;   // define integer variable inside the main method
        scanner = new Scanner(System.in);  // calling scanner class
        System.out.println("\nUppercase Alphabets are: ");
        uppStr = scanner.nextLine();
        char[] upch = uppStr.toCharArray();  // calling character variable
        for(i = 0; i < upch.length;i++){
            if (upch[i] >= 'A' && upch[i] <= 'Z'){
                upch[i] = (char)((int)upch[i] + 32);
            }
        }
        System.out.println("Lowercase Alphabets are: ");
        for(i = 0;i < upch.length;i++){
            System.out.println(upch[i]);
        }
    }
}
