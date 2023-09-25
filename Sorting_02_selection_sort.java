package Searching_sorting_with_basic;

public class Sorting_02_selection_sort {
    public static void selection(int arr[], int n){
        for(int i=0; i<n; i++){
            // find max item in remaining array and swapp with correct index
            int last=n-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
            print(arr,n);
        }
    }
    public  static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int getMaxIndex(int[] arr, int start, int end){
        int max=start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void print(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[]={4,5,1,2,3};
        int n=arr.length;
        selection(arr,n);
    }
}
