import java.util.Scanner;

public class SellerCommission9 {
   double salesamount,salary; // declare globle variable
   int id;
   String name;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales ID: ");  // taking input from the user
        int id=scanner.nextInt();

        System.out.println("Enter seller's name: ");
        String name = scanner.next();

        System.out.println("Enter sales amount:  ");
        double salesamount = scanner.nextDouble();

        if(salesamount >= 50000){
            System.out.println("Seller's commission is 35%.");
        } else if (salesamount >= 30000) {
            System.out.println("Seller's commission is 20%.");
        } else if (salesamount >= 20000) {
            System.out.println("Seller's commission is 10%.");
        } else if (salesamount >= 10000) {
            System.out.println("Seller's commission is 5%.");
        } else if (salesamount < 10000) {
            System.out.println("Seller's commission is 2%.");
        }
        else{
            System.out.println("no seller's commission.");
        }
    }
}
