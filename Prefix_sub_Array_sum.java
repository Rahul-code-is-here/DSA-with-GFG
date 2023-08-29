package GFGARRAYquestions;

public class Prefix_sub_Array_sum {
    public static void prefix(int arr[], int n){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        int prefix[]= new int[n];
        prefix[0]=arr[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0; i<n; i++){
            int start=i;
            for(int j=i; j<n; j++){
                int end=j;
                currsum= i == 0 ? prefix[j] :   prefix[j] - prefix[i-1];
               if(maxsum<currsum){
                   maxsum=currsum;
               }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args){
        int arr[]={1,-2,6,-1,3};
        int n=arr.length;
        prefix(arr,n);
    }
}
