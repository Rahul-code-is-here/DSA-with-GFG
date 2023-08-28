package GFGARRAYquestions;


import java.util.Arrays;

public class Self_zig_zag1 {
    public static void zigzag(int arr[], int n){
        Arrays.sort(arr);
        int i=1;
        int temp=0;
        while (i<n){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+2;
        }
    }
    public static  void main(String[] args){
        int arr[]={1,2,3,4,6,7,8};
        int n=arr.length;
        zigzag(arr,n);
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
