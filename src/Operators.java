import java.sql.SQLOutput;

public class Operators {

    public static  void main(String[] args){


        //Unary Operators

        boolean isPassed = false;



        System.out.println(!isPassed);

        int mark = -9;

        System.out.println("Marks are : " + mark);

        System.out.println(~mark);
// ++   it increases value by 1

        int rank = 10;
        rank++;
        System.out.println(rank);



// -- it decreases value by 1
        rank--;
        System.out.println(rank);


        int a=10;


        int b=5;

        int c=20;


        System.out.println(a  <   b &&  a   <   c);//false && true = false


        a%=2;
        System.out.println();


        System.out.println(a<b&a<c);//false & true = false





    }



}
