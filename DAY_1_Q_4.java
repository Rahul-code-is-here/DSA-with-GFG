package GFG_50_DAY_CHALLENGE;

import java.util.Arrays;

public class DAY_1_Q_4 {
    public  static long mergeAndCount(long[] arr, int l, int m, int r)
    {
        long[] left = Arrays.copyOfRange(arr, l, m + 1);  // m+1 copy nai thai eni pela na badha copy thashe
        long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);  // r+1 copy nai thai eni sivai na badha
        int i = 0, j = 0, k = l;
        long swaps = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += left.length - i;
                // a[i],a[i+1], a[i+2]+...+a[i+n1]<b[j]
                //a[i] ni right side na badha enathi mota so e badha inverse thashe
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }

    static long mergeSortAndCount(long[] arr, int l, int r)
    {
        long count = 0;
        if (l < r) {
            int m = (l + r) / 2;
            count += mergeSortAndCount(arr, l, m);  //left side na inversion count karashe
            count += mergeSortAndCount(arr, m + 1, r); //right side na inversion count karshe
            count += mergeAndCount(arr, l, m, r);// left and right side ne merge karie e vakhte
        }
        return count;
    }

    static long inversionCount(long arr[], long N)
    {
        return mergeSortAndCount(arr, 0, (int)N - 1);
    }
    public static void main(String[] args){
        long arr[] = {2, 4, 1, 3, 5};
        long n=arr.length;
        long inversion= inversionCount(arr,n);
        System.out.println(inversion);
    }
}
