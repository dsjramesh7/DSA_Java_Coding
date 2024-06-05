package basic2.myPractice;

import java.util.Scanner;

public class A11_FindUpperLowerCase {
    public static void main(String[] args) {
        //Q11: find uppercase and lower case of a character
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println(ch + " is an lowercase alphabet");
        }else{
            System.out.println(ch + " is an uppercase alphabet");
        }


    }
}
