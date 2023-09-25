package Searching_sorting_with_basic;

public class Searching_10_Mountain_Array {
    public static int peakIndexOfMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid= start +(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                // you are in decreasing part of array
                // this may be ans but look at left
                //this is why end != mid-1;
                end=mid;
            } else {
                // you are in assending part of array
                start=mid+1;  //because we know that mid+1 element > mid element
            }
        }
        // in the end , start == end and pointing to the largest number because of two checks above
        // start and end always trying to find max element in above 2 checks
        // hence, when they are pointinng to just one element, that is a max. number
        // last ma je last element vadhe e j best posiible ans
        return start; // or retuen end; both are same
    }
    public static void main(String[] args){
        int arr[]={0,1,0};
        int z= peakIndexOfMountainArray(arr);
        System.out.println(z);
    }
}
