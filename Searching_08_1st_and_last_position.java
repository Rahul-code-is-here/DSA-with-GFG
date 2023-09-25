package Searching_sorting_with_basic;

public class Searching_08_1st_and_last_position {
    public int[] searchRange(int nums[], int target){
        int ans[] = {-1,-1};
        // aaanthi start value mali jashe
       int start=search(nums,target,true);
       //aanathi end value mali jashe
        int end=search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    // this function  just returns the index value of target
    int search(int nums[],int target, boolean findIndex){
        int ans= -1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }
            else {
                // potential ans is found
                ans=mid;
                if(findIndex){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){

    }
}
