import java.util.Scanner;

public class Week2_Day1_If_ElseIf_Else {

    public static void main(String[] args){

            //How to take input from user
        System.out.println("Enter Number of Day: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfDay = scanner.nextInt();   // nextInt method is used to take integer input from User
        if(numberOfDay == 1 )
            System.out.println("Sunday");
        else if(numberOfDay == 2){
            System.out.println("Monday");
        }
        else if(numberOfDay ==3)
            System.out.println("Tuesday");
        else
            System.out.println("Some Other Day....");

        System.out.println("Program Continued...");
        System.out.println("Program Finished");


    }


}
