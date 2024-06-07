package P1_basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Enter a new Number: " );
        Scanner input = new Scanner(System.in);
        int rollNo = input.nextInt();
        String name = input.next();
        System.out.println("your new number is " + rollNo + " name is " + name);
    }
}
