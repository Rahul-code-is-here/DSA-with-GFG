package Searching_sorting_with_basic;

public class Sorting_bubble_sort {
    public static void bubbleSort(int arr[],int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
    }
    public static void print(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        bubbleSort(arr,n);
        print(arr,n);
    }
}
