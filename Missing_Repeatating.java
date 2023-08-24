package GFGARRAYquestions;

public class Missing_Repeatating {
    public static void find_two_element(int arr[], int n){
        int count[]=new int[n+1];
        int ans[]=new int[2];

        for(int i:arr){
            count[i]++;
        }
        for(int i=1; i<count.length; i++){
            if(arr[i]>1){
                ans[0]=i;
            }
            if(count[i]==0){
                ans[1]=i;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,2,4,5};
        int n=arr.length;
        find_two_element(arr,n);
    }
}
