package PATTERN_USING_RECURSION;

import java.util.Arrays;

public class Recursion_Pattern_01 {
    public static void bubble(int arr[], int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        }else {
            bubble(arr,r-1,0);
        }
    }

    public static void Selection(int arr[], int r, int c, int max){
        // here max ne argument ma nakhvathi j badha function call vakhate jo max
        // value update thati hashe to thai jashe
        //base condition
        if(r==0){
            return;
        }
        if(c<r){ // this like first pass
            // here max is index
            if(arr[c]>arr[max]){
                Selection(arr,r,c+1,c);
            }else {
                Selection(arr,r,c+1,max);
            }
        } // now we get max for first pass, now swap it
        else { // row=4 mate last index (r-1) 3 hashe
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;

            Selection(arr,r-1,0,0);
        }
    }
    public static void triangle2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle2(r,c+1);
            System.out.print("*");
        } else {
            triangle2(r-1,0);
            System.out.println();
        }
    }
    public static void triangle(int r, int c){
        //base condition
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r, c+1);
        }else {
            System.out.println();
            triangle(r-1,0);
        }
    }
    public static void  main(String[] args){
//         triangle(4,0);
//        triangle2(3,0);
        int arr[]={4,3,2,1};
//       bubble(arr,arr.length-1,0);
//       bubble sort ma c e c+1 sathe compare thai tethi row=arr.length-1
//       selection sort ma array na badha element sathe max je argument ma pass thayo tene
//       compare karvamo che, tethi row=arr.length
        Selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
