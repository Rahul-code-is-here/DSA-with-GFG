package Searching_sorting_with_basic;
// target element ne equal or greatert smallest number
public class Searching_05_ceiling_element {
    public static int ceiling(int arr[], int n,int target){
        int start=0;
        int end=n-1;

        if(target>arr[end-1]){
            return -1;
        }

        while(start<=end){
           int mid= start + (end-start)/2;
           if(target<arr[mid]){
               end=mid-1;
           }
           else if (target>arr[mid]){
               start=mid+1;
           }
           else {
               return  mid;
           }
        }
        return start;  // jo ceiling ni jgyae floor  hot to return end aavet. gtreatest no. smaler or = target
        //last ma start>end thai jashe means e element je mid ne equal nai male to start next greater and smallest no. hashe
    }
    public static void main(String[] args){
        int arr[]={2,3,5,9,14,16,18};
        int n=arr.length;
        int target=13;
        int ans= ceiling(arr,n,target);
        System.out.println(ans);
    }
}
