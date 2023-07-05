public class W3D1_Type_of_Arrays {

    public static void main(String[] args){

        //Single Dimension Array
        int[] rollnumbers = new int[4];


        //double dimension array
        //how to define
        int[][] grid = new int[3][4];
        grid[0][0] = 56;
        grid[2][4] = 345;
        grid[3][4] = 56;
        System.out.println(grid[3][4]);


        int[][] newGrid = { {2,3,4},{3,4,5,6},{45,6,7,9},{9,7,23,66}};

        //how to read data from Double dimension array
        for(int column=0;column<newGrid.length;column++){//outer loop

            for(int row =0;row < newGrid[column].length;row++){

                System.out.println("Value at newGrid["+row+"]["+column+"] :: " + newGrid[row][column]);
            }
        }
    }

}
