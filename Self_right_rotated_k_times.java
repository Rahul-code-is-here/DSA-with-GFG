package GFGARRAYquestions;

import java.util.Arrays;

public class Self_right_rotated_k_times {
    public static void rotate_K_times(int arr[], int n){
        int ans[]=new int[n];
        for(int i=0; i<n; i++){
            ans[i]=arr[i];
        }
        Arrays.sort(arr);
        int min=arr[0];
        for(int i=0; i<n; i++){
            if(ans[i]==min){
                System.out.println("array is "+ i + " times right rotated");
            }
        }

    }
    public  static void main(String[] args){
        int arr[]={5,1,2,3,4};
        int n=arr.length;
        rotate_K_times(arr,n);
    }
}
