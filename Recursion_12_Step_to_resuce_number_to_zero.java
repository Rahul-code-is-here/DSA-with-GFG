package Recursion_In_Java;

public class Recursion_12_Step_to_resuce_number_to_zero {
    public int numberOfsteps(int n){
        return helper(n,0);
    }
    public static int helper(int n, int step){
        if(n==0){
            return step;
        }
        if(n%2==0){
            return helper(n/2,step+1);
        }else {
            return helper(n-1, step+1);
        }
    }
    public static void main(String[] args){

    }
}
