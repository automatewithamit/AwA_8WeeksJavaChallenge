import java.util.Arrays;

public class W2D5_Arrays {
    public static  void main(String[] args){
        //we are storing data using different type variables

        int rollNo;   //variable declared

        rollNo = 23; //variable is initialized

        String studentName = "Amit Tripathi";
        boolean isPresent = false;


        //declaration of Arrays
        int[] rollNumbers = new int[9];
        rollNumbers[0] = 12;
        rollNumbers[1] =24;
        rollNumbers[2] = 2345;
        rollNumbers[4] = 423;
        rollNumbers[8] = 445;

        //indexing

//initialization of Arrays  --> we are putting data inside array
        String[] studentNames = {"Amit","Anil","Sarala"};

        boolean[] attendanceReport = {false,true,false,true,false,false,true};
//this is how we print data of an array using index
        System.out.println( "Roll no. of index 0 : " + rollNumbers[0]  );
        System.out.println( "Roll no. of index 1 : " + rollNumbers[1]);
        System.out.println( "Roll no. of index 2 : " + rollNumbers[2]);
        System.out.println("Student  at index 2 : " + studentNames[2] );
        System.out.println("attendance  at index 2 : " + attendanceReport[2] );

        //how to print data of whole array at once.using loop
        System.out.println("-------------------------------------------------------");
        for (int index = 0;index < rollNumbers.length;index++){
            System.out.println( "Roll no. of index "+ index +" : "+ rollNumbers[index]);
        }
        System.out.println("-------------------------------------------------------");
        for (int index = 0;index < studentNames.length;index++){
            System.out.println( "Student Name of index " + index + " : "+ studentNames[index]);
        }
        System.out.println("-------------reading data using foreach loop--------------------");

        for(String name : studentNames){
            System.out.println(name);
        }

for(int rollNumber : rollNumbers){
    System.out.println(rollNumber);
}

    }
}
