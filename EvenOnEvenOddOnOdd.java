package GFGARRAYquestions;

import java.util.Arrays;

public class EvenOnEvenOddOnOdd {
    public static void evenOdd(int arr[],int n) {
        //Arrays.sort(arr);
        int ans[] = new int[n];
        int even=0; int odd=1;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                ans[even]=arr[i];
                even=even+2;
            }
            else{
                ans[odd]=arr[i];;
                odd=odd+2;
            }
        }
        for(int i=0; i<n; i++){
            arr[i]=ans[i];
        }
    };
    public static void main(String[] args){
        int arr[]={3,6,12,1,5,8};
        int n=arr.length;
        evenOdd(arr,n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
