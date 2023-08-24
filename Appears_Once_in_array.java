package GFGARRAYquestions;

public class Appears_Once_in_array {
    public static int onceinarr(int arr[], int n){
        if(n==1)
          return arr[0];
        if(arr[0]!=arr[1])
           return arr[0];
        if(arr[n-1]!=arr[n-2])
            return arr[n-1];
        int low=0;
        int  high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                System.out.println(arr[mid]);
             return arr[mid];
            }
            else if(arr[mid]==arr[mid-1]){
                //low to mid element count
                int lc=mid-low+1;
                if(lc%2==0){
                    low=mid+1;
                }
                else{
                    high=mid-2;
                }
            }
            else if (arr[mid]==arr[mid+1]){
                //mid to high element count
                int rc=high-mid+1;

                if(rc%2==0){
                    high=mid-1;
                }
                else{
                    low=mid+2;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={1,1,2,3,3,4,4,5,5,6,6,7,7};
        int n=arr.length;
        onceinarr(arr,n);
    }
}
