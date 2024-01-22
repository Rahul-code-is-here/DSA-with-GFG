package GFG_50_DAY_CHALLENGE;
import java.util.*;

public class DAY_2_Q_2 {
    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here
        Arrays.sort(A);

        for (int i = 0; i < n ; i++) {
            // To find the other two elements, start two index variables from
            // two corners of the array and move them toward each other.
            int left = i + 1; // index of the first element in the remaining elements
            int right = n - 1; // index of the last element

            while (left < right) {
                if (A[i] + A[left] + A[right] == X) {
                    // If sum of elements at indexes i, left and right is equal to X, we found a triplet
                    return true;
                } else if (A[i] + A[left] + A[right] < X) {
                    // If the sum is less than X then increment the left index
                    left++;
                } else {
                    // If the sum is more than X then decrement the right index
                    right--;
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;


    }
    public static void main(String[] args){
        int arr[] = {1,4, 45, 6, 10, 8};
        int n=arr.length;
        boolean ans= find3Numbers(arr,n,13);
        System.out.println(ans);
    }
}
