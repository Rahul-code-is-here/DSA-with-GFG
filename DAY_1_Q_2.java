package GFG_50_DAY_CHALLENGE;
import java.util.*;

public class DAY_1_Q_2 {
    public static int majorityElement(int arr[], int size)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i=0; i<size; i++) {
            if (map.get(arr[i]) > size/2) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3};
        int size=arr.length;
        System.out.println(majorityElement(arr,size));
    }
}
