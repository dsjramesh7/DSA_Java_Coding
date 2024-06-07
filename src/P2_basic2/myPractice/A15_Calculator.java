package P2_basic2.myPractice;

import java.util.Scanner;

public class A15_Calculator {
    public static void main(String[] args) {
        int result = 0;
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if( op=='+' || op=='-' ||op=='/' ||op=='%' ||op=='*'){
                System.out.println("Enter Two Number: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    result = num1 + num2;
                }else if(op == '-'){
                    result = num1 - num2;
                }else if(op == '*'){
                    result = num1 * num2;
                }else if(op == '%'){
                    result = num1 % num2;
                }else if(op == '/'){
                    if(num2 !=0){
                        result = num2 / num1;
                    }
                }
            }else if(op == 'x'|| op == 'X'){
                break;
            }else{
                System.out.println("Invalid operation!!!");
            }
            System.out.println(result);
        }
    }
}
