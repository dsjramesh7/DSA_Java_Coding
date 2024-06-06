package basic2;

import java.util.Scanner;

public class functions {
    public static void main(String[] args){
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 + num2);
    }
}
