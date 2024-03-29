package Searching_sorting_with_basic;

public class Searching_09_Ifinite_Array {
    public static int ans(int[] arr, int target){
   //  first find the range
        // first start with a box with size 2
        int start=0;
        int end=1;

        //condition for the  target to  lie inn the rannge
        while ((target>arr[end])){
            int temp=end+1;
            //double the box value
            // end = end + sizeOfBox*2
            end=end + (end-start+1)*2; // ahi old start no ue karvano baki hovathi
            start=temp;  // ahi start  ne update kareli value assign kari
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int arr[],int target, int start, int end){
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
        return -1;
    }
    public static void main(String[] args){
       int arr[]={3,5,7,9,10,90,100,130,140,160,170};
       int target=10;
        int x= ans(arr,target);
        System.out.println(x);
    }
}
