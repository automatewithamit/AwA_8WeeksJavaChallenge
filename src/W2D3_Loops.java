import java.util.Scanner;

public class W2D3_Loops {

    public static void main(String[] args){

        //Write a program to print any name given by user 5 times.


        System.out.println("Enter Name for while loop: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

//        System.out.println("Name Given by user " + name);
//        System.out.println("Name Given by user " + name);
//        System.out.println("Name Given by user " + name);
//        System.out.println("Name Given by user " + name);
//        System.out.println("Name Given by user " + name);

        //Loops
//while
        int counter = 6;

        while(counter<=5/*condition*/){
            //infinite loop :: those loops which never get ended or keep on executing always and never ends
            System.out.println("Name from while Loop " + name);
            counter = counter +1;

            //lines of code which we want to execute until condition is false
        }
//statement1



        //We always should avoid duplicate code
        //we should always keep number of lines of code as lesser as possible

        System.out.println("Enter Name for do while loop : ");
        String name1 = scanner.nextLine();


        counter = 5;

        do{
            System.out.println("Name from do while loop " + name1);

            counter = counter +1;


        }while(counter<=5/*contition*/);




    }
}
