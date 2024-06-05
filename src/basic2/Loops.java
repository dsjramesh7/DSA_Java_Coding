package basic2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //Q: print numbers from 1 to 10
        //for loop
        for(int i = 1; i<= num; i++){
            System.out.print(i + " ");
        }


        //while loop
        int j=10;
        while(j>=1){
            System.out.print(j + " ");
            j--;
        }

        //do while loop
        do{
            System.out.println("don't print this ");
        }while(false);
    }
}
