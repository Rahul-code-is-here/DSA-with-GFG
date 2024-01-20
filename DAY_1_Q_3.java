package GFG_50_DAY_CHALLENGE;
import java.util.*;

public class DAY_1_Q_3 {
    public static int kthSmallest(int[] nums, int l, int r, int k)
    {
        //Your code here
        Arrays.sort(nums);
        return nums[k-1];
    }
    public static void main(String[] args){
        int arr[] = {7 ,10 ,4 ,3 ,20 ,15};
        int n=arr.length;
        int K = 3,
        L=0 ,R=5;
        System.out.println(kthSmallest(arr,L,R,K));
    }
}
