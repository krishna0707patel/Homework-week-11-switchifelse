import java.util.Scanner;

public class InterchangeValue5 {
    public static void main(String[] args) {
        int x,y,t; // were x and y are swap
        Scanner scanner = new Scanner(System.in);  // calling object
        System.out.println("Enter value of X and Y");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("before swapping numbers:\t" +x+"  "+y);
                                                                         //interchange values//
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping numbers:\t" +x+"  "+y);
        System.out.println();
    }
}
