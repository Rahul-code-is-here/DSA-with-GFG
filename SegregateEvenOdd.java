package GFGARRAYquestions;

import java.util.Arrays;

public class SegregateEvenOdd {
    public static void segregate(int arr[], int n){
        Arrays.sort(arr);
        int even=0;
        int temp=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                temp=arr[i];
                arr[i]=arr[even];
                arr[even]=temp;
                even++;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={8,12,34,90,13,9,45};
        int n=arr.length;
        segregate(arr,n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
