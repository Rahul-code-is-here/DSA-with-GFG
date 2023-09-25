package Searching_sorting_with_basic;

import java.util.Arrays;

public class TwoDArrays3 {

    public static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        // search in the row provided between the colms provided
        while (cStart<=cEnd){
            int mid= cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }else {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] search(int[][] matrix, int target){
        int row=matrix.length;
        int col=matrix[0].length;  // be caution matrix may be empty

        if(row==1){
            return binarysearch(matrix,0,0,col-1,target);
        }
        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;
        // run the loop till 2 row remaining
        while (rStart<(rEnd-1)){ // while this is true it will  have more than 2 rows
          int mid=rStart+ (rEnd-rStart)/2;
          // now all the cases

            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                //ignore above rows
                rStart=mid;
            }else {
                //ignore botton col
                rEnd=mid;
            }
        }
        // now we have two rows
        // check target is within in the col of 2 rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        // search in 1st half
        if(target <= matrix[rStart][cMid-1]){
          return binarysearch(matrix,rStart,0,cMid-1,target);
        }
        // search in 2nd half
        if(target >= matrix[rStart][cMid+1] && target<=matrix[rStart][col-1]){
           return binarysearch(matrix,rStart,cMid+1,col-1,target);
        }
        // search in 3rd half
        if(target <= matrix[rStart+1][cMid-1]){
         return binarysearch(matrix,rStart+1,0,cMid-1,target);
        }
        // search in 4th half
        if(target >= matrix[rStart+1][cMid+1]){
         return binarysearch(matrix,rStart+1,cMid+1,col-1,target);
        }
     return new int[]{-1,-1};
    }
    public static void main(String[] args){
    int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    System.out.println(Arrays.toString(search(arr,6)));
    }
}
