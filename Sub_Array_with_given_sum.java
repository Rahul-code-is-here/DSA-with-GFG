package GFGARRAYquestions;

import java.util.ArrayList;

public class Sub_Array_with_given_sum {
    public static ArrayList<Integer> subarray(int arr[], int n, int s){
        int l=0;
        int r=0;
        ArrayList<Integer> ans = new ArrayList<>();
        if(s==0){
            ans.add(-1);
            System.out.println(ans);
            return ans;
        }
        boolean isfound=false;
        int sum=arr[0];
        while(r<n){
            if(sum==s){
                isfound=true;
                break;
            } else if (sum<s) {
                r++;
                sum=sum+arr[r];
            } else {
                sum=sum-arr[l];
                l++;
            }
        }
        if(isfound){
            ans.add(l+1);
            ans.add(r+1);
            System.out.println(ans);
            return ans;
        }
        ans.add(-1);
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,7,5};
        int n=arr.length;
        int s=12;
        subarray(arr,n,s);
    }
}
