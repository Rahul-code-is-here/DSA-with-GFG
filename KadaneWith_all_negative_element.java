package ArraysinJava;

public class KadaneWith_all_negative_element {
    public static void max_sum(int arr[], int n){
        int max_sum=arr[0];
        int sum=0;

        for(int i=0; i<n; i++){
             sum= sum+arr[i];
           // sum=Math.max(arr[i],sum+arr[i]);
            //if (max_sum<sum) max_sum=sum;
            max_sum=Math.max(max_sum,sum);

            if(sum<0)
                sum=0;
        }
        //if all elements are negative
       /* if(max_sum<0){
            max_sum=Integer.MIN_VALUE;
            for(int i:arr){
                max_sum=Math.max(max_sum,i);
            }
        }*/
        System.out.println(max_sum);
    }
    public static  void main(String[] args){
        int arr[]={-1,-2,-3,-4,-5};
        int n=arr.length;
        max_sum(arr,n);
    }
}
