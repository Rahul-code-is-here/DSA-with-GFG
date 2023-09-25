package Searching_sorting_with_basic;

public class Searching_04_binary_search {
    public static int binarysearch(int arr[], int target){
        int start=0;
        int end=arr.length-1;

        //find the wether array is sorted in asending or desending
        boolean isAse=arr[start]<arr[end];  // or
      /*  boolean isAsending;
        if(arr[start] <arr[end]){
            isAsending = true;
        } else {
            isAsending = false;
        } */

        while (start<=end){
            int mid= start+ (end-start)/2; //aanathi start+end potani boundry exceed nai kare

            if(arr[mid]==target){
                return mid;
            }

            if(isAse){
                if(target<arr[mid]){
                    end=mid-1;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }
            } else {
                if(target<arr[mid]){
                    start=mid+1;
                } else if (target>arr[mid]) {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=22;
        int x=binarysearch(arr,target);
        System.out.println(x);
    }
}
