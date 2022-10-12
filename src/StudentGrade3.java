import java.util.Scanner;

public class StudentGrade3 {
    static String name;  // define globle variable inside the class but out side the main method
    static int RollNo;
    static double total;
    static double percentage;
    static double Eng,Math,Science;

        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student name:\t"); // taking output from the user
        name = scanner.next();

        System.out.println("Enter Roll number:\t");
        RollNo = scanner.nextInt();

        System.out.println("Enter marks for Eng:\t");
        Eng = scanner.nextDouble();

        System.out.println("Enter marks for Math:\t");
        Math = scanner.nextDouble();

        System.out.println("Enter marks for Science:\t");
        Science = scanner.nextDouble();

       double total =Eng+Math+Science;
       double percentage = total/3;

        System.out.println(name + "\tRollnumber=" + RollNo + "\tTotal marks:" + total + "\t&\tpercentage:\t" + percentage + "%");


         if (percentage >= 80){     // using nested loop
            System.out.println("you Pass with A+ Grade.");
        } else if (percentage >= 60){
            System.out.println("you pass with A Grade.");
        } else if (percentage >= 50) {
            System.out.println("you pass with B Grade.");
        }
         else if (percentage >= 35) {
             System.out.println("you pass with C Grade.");
         }
         else{
             System.out.println("you are Fail.");
         }
        }
    }

