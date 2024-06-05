package basic2.myPractice;

import java.util.Scanner;

public class A10_LargestAmongGivenNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // q: find the largest of the given three numbers
        if(a>b && a>c){
            System.out.println(a + " is the greatest number among the given number by user");
        }else if(b>a && b>c){
            System.out.println(b + " is the greatest number among the given number by user");
        }else{
            System.out.println(c + " is the greatest number among the given number by user");
        }
    }
}
