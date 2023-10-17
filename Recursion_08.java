package Recursion_In_Java;

public class Recursion_08 {
    public static int sum(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){
        int ans=sum(5);
        System.out.println(ans);
    }
}
