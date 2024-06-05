package basic2.myPractice;

public class A14_ReverseNumber {
    public static void main(String[] args) {
        int n = 1234567;
        int reverseOrderresult = 0;

        while(n>0){
            int lastdigit = n%10; //7
            reverseOrderresult = (reverseOrderresult*10)+lastdigit;
            n= n/10;
        }
        System.out.println(reverseOrderresult);
    }
}
