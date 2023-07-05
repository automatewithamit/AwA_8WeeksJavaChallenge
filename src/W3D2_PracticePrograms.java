import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class W3D2_PracticePrograms {

    public static void main(String[] args){

//1. Write a program that prompts the user to input a positive integer.
// It should then print the multiplication table of that number.
//        System.out.println("Enter number for table : ");
//        Scanner scn = new Scanner(System.in);
//        int number = scn.nextInt();
//
//        // 5 * 1 = 5
//        // 5 * 2 = 10
//        // 5 * 3 = 15
//        for (int counter = 1;counter<=10;counter++){
//            //This is called String Manipulation
//            System.out.println(number + " * " + counter +" = " + number * counter);
//        }

        //2. Write a program to take multiple integers  from user and print the sum of all the numbers

//        System.out.println("Enter the count of integers: ");
//        Scanner scn = new Scanner(System.in);
//        int countOfIntegers = scn.nextInt();
//        int[] numbers = new int[countOfIntegers];
//
//        for(int counter=0; counter<countOfIntegers;counter++){
//            numbers[counter] = scn.nextInt();
//        }
//        int sum=0;
//        for(int counter=0; counter<countOfIntegers;counter++){
//           sum = sum + numbers[counter]; //sum +  numbers[2] //2.
//        }
//        System.out.println("Sum of All Integers :: " + sum);

//3. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        // 45,768,34,23,567,90,2,34,657  --> Reading and Storing Data provided by user :  Array needs to be used
        //45 + 23 + 567 + 657 = ? --> we need to find out even and odd number
        //768+ 34 +90 + 2 + 34 = ? --> print the sum of odd and even numbers


//Print the Pattern
//*****
//****
//***
//**
//*
// 1 2 3 4
// 1 2 3
// 1 2
// 1


     //1
     //1 2
     //1 2 3
     //1 2 3 4

//*
//**
//***
//****
//*****

//        System.out.println("Enter the line of Star Pattern : ");
//        Scanner scn = new Scanner(System.in);
//        int numberOfLines = scn.nextInt();
//
//            for(int i=numberOfLines;i>=1;i-- ){//outer loop is representing the Lines in the pattern
//
//                for(int j = i ;j>=1;j--){
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//----------------------------------------------------------------
//Write a Java program to reverse an array of integer values.

int[] array = {34,6,9,1,7,10,37,45};

int[] reversedArray = new int[array.length];

        System.out.println("Original Array : " + Arrays.toString(array));
        System.out.print("Reversed Array : [");
        for(int index =array.length-1; index >=0;index--){
            System.out.print(array[index] + ", ");
        }
        System.out.println("]");

    }

}
