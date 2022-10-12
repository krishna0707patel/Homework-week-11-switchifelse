import java.util.Scanner;

public class EmployeeSalary6 {
     double basicsalary,hra,da,ta,pf,gross; //declare globle variable
     int id;
     String name;

     public void print(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the employee name: ");//taking all the inputs from the user
         name= scanner.nextLine();
         System.out.println("Enter the employee ID: ");
         id=scanner.nextInt();
         System.out.println("Enter the employee salary: ");
         basicsalary= scanner.nextInt();
     }
     public void count(){ // calculation of all parameters counting
         hra=basicsalary*10/100;
         da=basicsalary*8/100;
         ta=basicsalary*9/100;
         pf=basicsalary*20/100;
         gross=basicsalary+hra+da+ta-pf;
     }

     public void display(){   //display all the parameters calculation
         count();
         System.out.println("HRA=  " +hra);
         System.out.println("DA=  " +da);
         System.out.println("TA=  " +ta);
         System.out.println("PF=  " +pf);
         System.out.println("Gross salary= "+gross+ "&\tHRA= "+hra+ "&\tDA= "+da+ "&\tTA= "+ta+ "&\tPF= "+pf );
     }

    public static void main(String[] args) {
        EmployeeSalary6 employeeSalary = new EmployeeSalary6();  //calling object
        employeeSalary.print();  //calling print function
        employeeSalary.count(); //calling count function
        employeeSalary.display();  // calling display function

    }

}
