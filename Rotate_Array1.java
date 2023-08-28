package GFGARRAYquestions;


import java.util.Scanner;

public class Rotate_Array1 {
    public static void reverse(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void rotate(int arr[], int n, int D){
        reverse(arr,0,D-1);
        reverse(arr,D,n-1);
        reverse(arr,0, n-1);
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter thee value of D");
        int D=sc.nextInt();
        System.out.println("before rotate:");
        for(int i=0 ; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        rotate(arr,n,D);
        // 2 1 3 4 5
        // 2 1 5 4 3
        // 3 4 5 1 2
        System.out.println("after rotate:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

