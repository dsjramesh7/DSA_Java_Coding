package P2_basic2;

import java.util.Scanner;

public class functions {
    public static void main(String[] args){
        sum();
        String name = message("Messi");
        System.out.println(name + " is a goat person");


        //function overloading
        sameName(12);
        sameName("kira");

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 + num2);
    }

    static String message(String name){
        return name;
    }


    //function overloading
    static void sameName(int a){
        System.out.println(a);
    }
    static void sameName(String name){
        System.out.println(name);
    }
}
