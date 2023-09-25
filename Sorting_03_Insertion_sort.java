package Searching_sorting_with_basic;

public class Sorting_03_Insertion_sort {
    public static void insertion_sort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            for (int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int arr[], int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args){
        int arr[]={3,5,4,1,2};
        int n=arr.length;
        insertion_sort(arr,n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
