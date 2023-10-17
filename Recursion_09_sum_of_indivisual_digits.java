package Recursion_In_Java;

public class Recursion_09_sum_of_indivisual_digits {
    public static int sumOfIndivisualDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfIndivisualDigits(n/10);
    }
    public static void main(String[] args){
        int ans=sumOfIndivisualDigits(1234);
        System.out.println(ans);
    }
}
