package ArraysinJava;

public class KadaneAlgo {
    public static void kadane(int number[]){
        int max_sum=Integer.MIN_VALUE;
        int current_sum=0;
        for(int i=0; i<number.length-1; i++){
            current_sum=current_sum +number[i];
            if(current_sum<0){
                current_sum=0;
            }
            max_sum=Math.max(current_sum,max_sum);
        }
        System.out.println("max sum is: " + max_sum);
    }

    public static void main(String[] args){
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(number);

    }
}
