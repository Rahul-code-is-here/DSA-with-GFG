package Searching_sorting_with_basic;
import java.util.*;

public class Searching_01_search_in_2d_array {
    static int[] search(int[][] arr, int target){  //return another arrays which contain row,colomn
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row,col}; // return new int array(row,colomn)
                    // new kwyword vagar erroe aavshe because it is not initialize
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[][] arr= {
                {23,4,1,},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target=34;
        int[] ans=search(arr,target);  //format of return value row and column
        System.out.println(Arrays.toString(ans));
    }
}
