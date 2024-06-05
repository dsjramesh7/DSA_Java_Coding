package basic.myPractice;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class A1_EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to check if its even or odd: ");
        int yourNumber = input.nextInt();
        if(yourNumber/2 == 0){
            System.out.println(yourNumber + " is an Even Number" );
        }else{
            System.out.println(yourNumber + " is an Odd Number");
        }

    }
}
