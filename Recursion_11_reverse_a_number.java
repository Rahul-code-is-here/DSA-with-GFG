package Recursion_In_Java;

public class Recursion_11_reverse_a_number {
    static int sum=0;
    public static void rev1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }
    public static int rev2(int n){
        //some times you need some additional variables in the argument
        // in that case make another function
        int digit=(int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    public static int helper(int n, int digit){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return (int) (rem * Math.pow(10,digit-1)+ helper(n/10, digit-1));
    }
    public static boolean palindrome(int n){
        return n==rev2(n);
    }
    public static void main(String[] args){
//        rev1(1234);
//        System.out.println(sum);
//        System.out.println(rev2(1234));
        System.out.println(palindrome(1234321));
    }
}
