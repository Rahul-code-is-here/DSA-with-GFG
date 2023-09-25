package Searching_sorting_with_basic;

public class Searching_12_Finding_Rotation_count {
    public static int countRotation(int arr[]){
        int pivot=findPivot(arr);
        return pivot+1;
    }
    public static int binarySearch(int arr[],int target, int start, int end){
        while(start<=end){
            int mid= start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else {
                return  mid;
            }
        }
        return -1;
    }
    public static int findPivot(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            // 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            if(arr[mid]>arr[start]){
                start=mid+1;
            }
        }
        return -1;
    }

    public static int findWithDuplicate(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+ (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // if elements at middle,start,end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //NOTE: what is these elements at start and end are pivot??
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so pivot should be in right
            else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
     int arr[]={1,2,3,4,5,6,7};
     System.out.println(countRotation(arr));
    }
}
