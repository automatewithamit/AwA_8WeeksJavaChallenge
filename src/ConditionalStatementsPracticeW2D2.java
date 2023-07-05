import java.sql.SQLOutput;
import java.util.Scanner;

public class ConditionalStatementsPracticeW2D2 {


    public static void main(String[] args){

        //----------------------------------------------------------------------------------------------------------------
//String number1 = "2";
//String number2 = "3";
//
//        System.out.println(number1+number2);// when we use + sign with String , Strings concatenates
//        System.out.println(number2+number1);
//        int num1 = 2;
//        int num2 = 3;
//        System.out.println(num1+num2);// when we use + sign with String , Strings concatenates
//        System.out.println(num2+num1);
        //5
        //2,3
//----------------------------------------------------------------------------------------------------------------
        //Write a Program to take input from  user and print corresponding Name of the day.
        //1 --> Monday
        //2 --> Tuesday
        //3--> Wednesday
        //4--> Thursday

//        System.out.println("Enter a number : ");
//        Scanner scn = new Scanner(System.in);
//        int numberOfDay =  scn.nextInt();
//
//        if(numberOfDay==1) {
//            System.out.println("Monday");
//        }else if(numberOfDay==2){
//            System.out.println("Tuesday");
//        } else if (numberOfDay==3) {
//            System.out.println("Wednesday");
//        }else if (numberOfDay==4) {
//            System.out.println("Thursday");
//        }else if (numberOfDay==5) {
//            System.out.println("Friday");
//        }else if (numberOfDay==6) {
//            System.out.println("Saturday");
//        }else if (numberOfDay==7) {
//            System.out.println("Sunday");
//        }else{
//            System.out.println("Not any Day");
//        }

//----------------------------------------------------------------------------------------------------------------
        //Write a program to take 2 numbers as input from the user and Print which number is greater or lesser.
//        System.out.println("Enter a number 1 : ");
//        Scanner scn = new Scanner(System.in);
//        int number1 =  scn.nextInt();
//        System.out.println("Enter a number 2 : ");
//        int number2 =  scn.nextInt();
//
//        if(number1>number2){
////            System.out.println("number1 is Greatest");
//// "67 is greater than 45"
//            System.out.println(number1 + " is Greater than " + number2 );
//        }else {
//            System.out.println(number2 + " is Greater than " + number1 );
//            //System.out.println("number2 is Greatest");
//        }
//----------------------------------------------------------------------------------------------------
//Write a Program to find if number given by user is even number or Odd number

//even numbers are those numbers are those numbers which get divided by 2 or remainder while dividing 2 should be 0
//
//        System.out.println("Enter a number : ");
//        Scanner scn = new Scanner(System.in);
//        int number =  scn.nextInt();
//if(number%2==0){
//    System.out.println(number + " is an even Number");
//}else
//{
//    System.out.println(number + " is an Odd Number");
//}

//----------------------------------------------------------------------------------------------------
//Write a program to print if a character input by user is a vowel or consonants
        //vowels a e i o u

//        System.out.println("Enter a Character : ");
//        Scanner scn = new Scanner(System.in);
//        char character =  scn.next().charAt(0);
//        if(character=='a'){
//            System.out.println(character + " is Vowel");
//        } else if (character=='e') {
//            System.out.println(character + " is Vowel");
//        }
//        else if (character=='i') {
//            System.out.println(character + " is Vowel");
//        }
//        else if (character=='o') {
//            System.out.println(character + " is Vowel");
//        }
//        else if (character=='u') {
//            System.out.println(character + " is Vowel");
//        }else{
//            System.out.println(character + " is Consonant");
//        }
//----------------------------------------------------------------------------------------------------
        // JAVA is a case sensitive language
        // a A
        //apple Apple aPple apPle appLe
        //
//----------------------------------------------------------------------------------------------------
//        System.out.println("Enter a Character : ");
//        Scanner scn = new Scanner(System.in);
//        char character =  scn.next().charAt(0);
////logical operators
//        if(character=='a' || character =='e'||character=='i'||character=='o'||character=='u' ){
//            System.out.println(character + " is a Vowel");
//        }else {
//            System.out.println(character + " is Consonant");
//        }

//----------------------------------------------------------------------------------------------------
//Write a program to find biggest number out of 3 different numbers given by user


//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter a number1 : ");
//
//        int number1 =  scn.nextInt();
//
//        System.out.println("Enter a number2 : ");
//
//        int number2 =  scn.nextInt();
//        System.out.println("Enter a number3 : ");
//
//        int number3 =  scn.nextInt();
//// dry run --> if we are executing our program manually rather than with the help of IDE then its called dry run
//        // number1 --> 4   number2 --> 1  number3 --> 8
//        if(number1>number2){ //8 > 4 --> true
//            if(number1>number3){//8 > 1   --> true
//                System.out.println(number1 + " is Greatest"); // 8  is Greatest
//            }else {
//                System.out.println(number3 + "is Greatest");
//            }
//
//        }else
//        {
//            if(number2>number3){ //8>1
//                System.out.println(number2 + " is Greatest");
//            }else {
//                System.out.println(number3 + " is Greatest");
//            }
//        }


//----------------------------------------------------------------------------------------------------

//Write a Program to take input from  user and print corresponding Name of the day.
        //1 --> Monday
        //2 --> Tuesday
        //3--> Wednesday
        //4--> Thursday

        System.out.println("Enter a number : ");
        Scanner scn = new Scanner(System.in);
        int numberOfDay =  scn.nextInt();

        switch (numberOfDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not any Day");
        }








    }







}
