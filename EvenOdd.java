package GFGARRAYquestions;

import java.util.Arrays;

public class EvenOdd {
    public static void segregate(int arr[],int n){
        Arrays.sort(arr);
        int count=0;
        int ans[]= new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                ans[count]=arr[i];
                System.out.println(ans[count]);
                count++;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]%2!=0){
                ans[count]=arr[i];
                System.out.println(ans[count]);
                count++;
            }
        }
        for(int i=0; i<n; i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args){
        int arr[]={12,34,45,9,8,90,13};
        int n=arr.length;
        segregate(arr,n);
    }
}
