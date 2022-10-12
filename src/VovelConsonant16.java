import java.util.Scanner;

public class VovelConsonant16 {
    public static void main(String args[]){ //main metod declaration
        char ch;//local variable
       Scanner scanner = new Scanner(System.in); //this statements takes input from the user

        System.out.print("Enter an Alphabet: "); //get input and it is stored ch variable

        ch = scanner.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            System.out.print(ch+" is \'VOVEL\'");
        }
        else{
            System.out.print(ch+" is  \'CONSONANT\'");
        }
    } //end of mainmethod
}



