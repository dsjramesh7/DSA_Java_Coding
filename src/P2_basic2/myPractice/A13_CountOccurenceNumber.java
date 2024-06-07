package P2_basic2.myPractice;

import java.util.Scanner;

public class A13_CountOccurenceNumber {
    public static void main(String[] args) {
        //Q13: number of occurence of a digit  in a number
        Scanner input = new Scanner(System.in);
        int bigNum = input.nextInt();
        int n = input.nextInt();


        int count = 0;

        while(bigNum > 0){
            int rem = bigNum % 10;
            if(rem == n ){
                count++;
            }
            bigNum = bigNum /10;
        }
        System.out.println(count);
    }
}
