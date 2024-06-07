package P3_ArrayPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        ArrayList<Integer> randomNumber = new ArrayList<>(5);
        randomNumber.add(123);
        randomNumber.add(123);
        randomNumber.add(123);
        randomNumber.add(123);
        randomNumber.add(123);
        randomNumber.add(123);
        randomNumber.add(123); //7th element here but initialcapacity is 10

        System.out.print(randomNumber);
        System.out.println();
        System.out.println(randomNumber.set(2,69));
        System.out.print(randomNumber);


        ArrayList<Integer> inputcreateArryaNumber = new ArrayList<>(5);
        for(int i = 0; i<5; i++){
            inputcreateArryaNumber.add(in.nextInt());
        }

        for(int i = 0; i<5; i++){
            System.out.println(inputcreateArryaNumber.get(i));
        }



    }
}
