import java.util.Scanner;
public class LeapYearyear2 {
    int year;   // define globle variable inside the class but out side the main method
    boolean leap = false;
    public static void main(String[] args) {
        System.out.println("Enter year: ");  // taking output from the user
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean leap = false;
        if (year % 4 == 0) {      // using if-else statment
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;}
                leap = true;}
            else
                leap = false;

         if (leap == true)
         System.out.println("This year\t" + year + "\tis a leap year.");
         else{
             System.out.println("This year\t" +year+ "\tis not a leap year.");
            }
        }
    }






