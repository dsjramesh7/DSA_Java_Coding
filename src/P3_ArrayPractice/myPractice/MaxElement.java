package P3_ArrayPractice.myPractice;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,5,34,3,12,69,14,45,56,};
        System.out.println(findMaxElement(arr));;
    }

    static int findMaxElement(int[] arr) {
        int maxValue = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
