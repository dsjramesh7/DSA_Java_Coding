package P3_ArrayPractice.myPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));

    }

    static  void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}
