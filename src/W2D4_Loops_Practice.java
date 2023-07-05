public class W2D4_Loops_Practice {
    public static void main(String[] args){
//Write a program to print numbers from 1 to 10 using do while Loop

//        int number = 1;
//        do{
//            System.out.println(number);//3456
//            number = number + 1; //number++; // number +=1; // 3 ,4567
//
//        }while(number<=10);

//        for(int number =1;number<=10;number++){
//            System.out.println(number);
//        }
//        int counter = 1;
//        for( ;counter<=1;counter--){
//            System.out.println("For Loop");
//        }

//        String[] namesOfStudents = {"Amit",
//                                     "Automate",
//        "UK",
//        "TN","UP","Gujrat"};
//           for(String name:namesOfStudents){
//               System.out.println(name);
//           }

        for(int i =1; i<=5;i++){//outer loop body
            System.out.println("outer loop body Starts for " + i);

            for(int j=1;j<=5;j++){//inner loop
                System.out.println(j);
            }
            System.out.println("outer loop body ends here for " + i);
        }


        //Write a Program to print numbers in reverse order  from 10 to 1 → using while , do while and for loop
//        for(int counter =10;counter>=1;counter--){
//            System.out.println(counter);
//        }

    }
}
