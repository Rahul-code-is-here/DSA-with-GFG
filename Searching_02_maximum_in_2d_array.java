package Searching_sorting_with_basic;

public class Searching_02_maximum_in_2d_array {
    static  int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]>max){
                    max= arr[row][col];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1,},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
       System.out.println(max(arr));
    }
}
