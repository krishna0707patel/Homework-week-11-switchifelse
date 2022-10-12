import java.util.Scanner;

public class PossitiveNegative8 {
    public static void main(String[] args) {
        int num; // calling variable inside the main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:  ");
        int number = scanner.nextInt();

        if(number>0){   // using nested loop
            System.out.println("The given number " +number+ "\tis positive.");
        } else if (number<0){
            System.out.println("The given number " +number+ "\tis negative.");}
        else{
            System.out.println("The number is zero.");
        }

        }
    }

