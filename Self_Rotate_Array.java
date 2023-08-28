package GFGARRAYquestions;

import java.util.*;

public class Self_Rotate_Array {
    public static void rotate(int arr[], int n, int D){
       while (D>0){
           int temp=arr[0];
           for(int j=0; j<n-1; j++){
               arr[j]=arr[j+1];
           }
           arr[n-1]=temp;
           D--;
       }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of D:");
        int D=sc.nextInt();
        rotate(arr,n,D);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
