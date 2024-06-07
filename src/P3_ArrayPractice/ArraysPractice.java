package P3_ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] rollNos = {1,24,5,23,45,78};
        System.out.println(rollNos[1]);
        System.out.println(Arrays.toString(rollNos));
        //or
        int[] rollNo2 = new int[7];
        System.out.println(rollNo2[1]);


        //for input
        for(int i = 0; i<rollNo2.length; i++){
            rollNo2[i]= in.nextInt();
        }

        //for output
        for(int i=0; i<rollNo2.length; i++){
            System.out.print(rollNo2[i] + " ");
        }

    }
}
