import java.util.Scanner;

public class NumberAlphabetsymbol14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any character:  ");  // take input from the user
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){  // using operator
            System.out.println( ch + " is a alphabet. ");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch+ " is a Number. ");
        }
        else {
            System.out.println(ch + "is a Special character.");
        }

    }
}
