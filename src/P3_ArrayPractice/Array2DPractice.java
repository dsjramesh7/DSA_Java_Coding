package P3_ArrayPractice;


import java.util.Arrays;
import java.util.Scanner;

public class Array2DPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        int[][] twoD = {{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(Arrays.toString(twoD[2]));
        //System.out.println(twoD[0][1]);

        int[][] input2darray = new int[3][3];

        //input of 2d array
        for(int row=0 ; row<input2darray.length; row++){
            for(int col=0; col<input2darray[row].length;col++){
                input2darray[row][col] =  in.nextInt();
            }
        }

        //output of 2d array
        for(int row=0 ; row<input2darray.length; row++){
            for(int col=0; col<input2darray[row].length;col++){
                System.out.print(input2darray[row][col] + " ");
            }
            System.out.println();
        }

        //output of 2d array in array string
        for(int row=0 ; row<input2darray.length; row++){
            System.out.println(Arrays.toString(input2darray[row]));
        }
    }
}
