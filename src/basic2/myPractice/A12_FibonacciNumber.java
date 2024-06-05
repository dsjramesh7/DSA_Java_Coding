package basic2.myPractice;

import java.util.Scanner;

public class A12_FibonacciNumber {
    public static void main(String[] args) {
        //q12: fibonacci series of nth number
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int previous = 0;
        int current = 1;
        int count = 2;

        while(count<=num){
            int temp = current;
            current = previous + current;
            previous = temp;
            count++;
        }
        System.out.println(current);
    }
}
