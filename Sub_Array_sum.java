package GFGARRAYquestions;

public class Sub_Array_sum {
    public static void SumOfSubArray(int arr[], int n){
        int minsum=Integer.MAX_VALUE;
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                currsum=0;
                for(int k=i; k<=j; k++){
                   currsum=currsum+arr[k];
                }
                System.out.println("all possible subArray sum"+currsum  );
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("maax sum is"+ maxsum);
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        SumOfSubArray(arr,n);
    }
}
