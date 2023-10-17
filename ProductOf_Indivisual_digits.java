package Recursion_In_Java;

public class ProductOf_Indivisual_digits {
    public static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }
    public static void main(String[] args){
        int ans= product(3);
        System.out.println(ans);
    }
}
